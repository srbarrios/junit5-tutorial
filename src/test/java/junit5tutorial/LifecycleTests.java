package junit5tutorial;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleTests {

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
    @DisplayName("A) This is the first test")
    void firstTest(){
        System.out.println("This is the first test");
    }

    @Test
    @DisplayName("B) This is the second test")
    void secondTest(){
        System.out.println("This is the second test");
    }

    @Test
    @DisplayName("C) This is the third test")
    void thirdTest(){
        System.out.println("This is the third test");
    }
}
