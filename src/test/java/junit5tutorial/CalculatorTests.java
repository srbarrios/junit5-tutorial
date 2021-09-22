package junit5tutorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveValues() {
        int a = 3;
        int b = 17;
        int result = calculator.add(a, b);
        assertTrue(
                result > 0,
                String.format("If '%s' and '%s' are positive the result '%s' should be positive", a, b, result)
        );
    }

    @Test
    public void testAddNegativeValues() {
        int a = -5;
        int b = -7;
        int result = calculator.add(a, b);
        assertTrue(
                result < 0,
                String.format("If '%s' and '%s' are negative the result '%s' should be negative", a, b, result)
        );
    }

    @Test
    public void testAddOppositeValues() {
        int a = 2;
        int b = -2;
        int result = calculator.add(a, b);
        assertTrue(
                result == 0,
                String.format("If '%s' and '%s' are opposite the result '%s' should be zero", a, b, result)
        );
    }
}
