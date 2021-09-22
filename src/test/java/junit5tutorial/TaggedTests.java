package junit5tutorial;

import org.junit.jupiter.api.*;

@Tag("demo")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TaggedTests {

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
    @Tag("sanity")
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @Tag("acceptance")
    void secondMethod(){
        System.out.println("This is the second test method");
    }

    @Test
    @Tag("acceptance")
    @Tag("long")
    void thirdMethod(){
        System.out.println("This is the third test method");
    }
}
