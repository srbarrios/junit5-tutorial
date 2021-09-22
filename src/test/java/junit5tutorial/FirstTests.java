package junit5tutorial;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTests {

    @BeforeAll
    void beforeAll(){
        System.out.println("--This is the before ALL method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("--This is the before Each method");
    }

    @AfterAll
    void afterAll(){
        System.out.println("--This is the after ALL method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("--This is the after EACH method");
    }

    @Test
    @Order(3)
    @DisplayName("A) This is the first test")
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @Order(1)
    @DisplayName("B) This is the second test")
    void secondMethod(){
        System.out.println("This is the second test method");
    }

    @Test
    @Order(2)
    @DisplayName("C) This is the third test")
    void thirdMethod(){
        System.out.println("This is the third test method");
    }
}
