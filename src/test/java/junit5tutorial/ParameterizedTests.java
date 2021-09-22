package junit5tutorial;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6,7})
    void intValues(int intParam){
        System.out.println("intParam = " + intParam);
    }

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"one","two","three"})
    void stringValues(String strParam){
        System.out.println("strParam = " + strParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"oscar,barrios,not_used","copito,gato","capitan,perro"})
    void csvSource_StringString(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"oscar,37,true","Lukas,4,false","sandra,33,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3){
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @ParameterizedTest
    @MethodSource(value = "junit5tutorial.ParamProvider#sourceString")
    void methodSource_String(String param1){
        System.out.println("param1 = " + param1);
    }

    @ParameterizedTest
    @MethodSource(value = "junit5tutorial.ParamProvider#sourceList_StringDouble")
    void methodSource_StringDoubleList(String param1, double param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }
}
