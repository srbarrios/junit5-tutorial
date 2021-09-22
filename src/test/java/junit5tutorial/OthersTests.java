package junit5tutorial;

import annotations.MyAnnotation;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class OthersTests {

    @Test
    @Timeout(value = 1500, unit = TimeUnit.MILLISECONDS)
    void timeout() throws InterruptedException {
        System.out.println("This is the test with a timeout");
        Thread.sleep(3000);
    }

    @MyAnnotation
    void customAnnotationTest() throws InterruptedException {
        System.out.println("This is the test with a custom annotation");
        Thread.sleep(3000);
    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class NestedTestClass {

        @BeforeAll
        void beforeAll() {
            System.out.println("Before All in nested test class");
        }

        @Test
        void nestedTestMethod(){
            System.out.println("Nested test method");
        }
    }
}
