package junit5tutorial;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AssumptionsTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6,7})
    void intValues(int intParam){
        assumeTrue(intParam > 5);
        System.out.println("intParam = " + intParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"oscar,barrios,not_used","copito,gato","capitan,perro"})
    void csvSource_StringString(String param1, String param2){
        assumeFalse(param1.equals("oscar"), "Skipping. The assumption failed for the following param1: " + param1);
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"oscar,37,true","Lukas,4,false","sandra,33,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3){
        assumingThat (param2 > 18, () -> System.out.println("Run this code only if param2 > 18"));
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }
}
