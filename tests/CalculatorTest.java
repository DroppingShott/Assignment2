import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testDivideNormal() {
        // Test normal division
        assertEquals(5.0, Calculator.divide(10, 2), 0.0001, "10 / 2 should be 5");
        assertEquals(3.0, Calculator.divide(9, 3), 0.0001, "9 / 3 should be 3");
    }

    @Test
    public void testDivideWithDecimals() {
        // Test division with decimal results
        assertEquals(2.5, Calculator.divide(5, 2), 0.0001, "5 / 2 should be 2.5");
        assertEquals(2.3333, Calculator.divide(7, 3), 0.0001, "7 / 3 should be approximately 2.3333");
    }

    @Test
    public void testDivideByZero() {
        // Test division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(1, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
