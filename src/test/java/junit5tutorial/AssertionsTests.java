package junit5tutorial;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AssertionsTests {

    @Test
    void assertEqualsTest(){
        assertEquals("firstString", "secondString", "The string values were not equal");
        System.out.println("This is the first test method");
    }

    @Test
    void assertEqualsListTest(){
        List<Integer> actualValues = Arrays.asList(1,5,6);
        List<Integer> expectedValues = Arrays.asList(1,3,6);
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void assertArraysEqualsListTest(){
        int[] actualValues = {1,5,6};
        int[] expectedValues = {1,3,6};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void assertTrueFalse(){
        assertFalse(false, "Assert False triggered");
        assertTrue(false, "Assert True triggered");
    }

    @Test
    void assertThrowsTest(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            String value = null;
            value.split(",");
        });
    }

}
