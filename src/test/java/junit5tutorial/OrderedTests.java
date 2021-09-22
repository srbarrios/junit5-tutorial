package junit5tutorial;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTests {

    @Test
    @Order(3)
    @DisplayName("A) This is the first test")
    void firstTest(){
        System.out.println("This is the first test");
    }

    @Test
    @Order(1)
    @DisplayName("B) This is the second test")
    void secondTest(){
        System.out.println("This is the second test");
    }

    @Test
    @Order(3)
    @DisplayName("C) This is the third test")
    void thirdTest(){
        System.out.println("This is the third test");
    }
}
