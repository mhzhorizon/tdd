package tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionCalculatorTest {

	@Test
    void testNegativeInteger() {
        AdditionCalculator calculator = new AdditionCalculator();
        try {
            calculator.add(5, -3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative integers are not allowed.", e.getMessage());
        }
    }
	
	 @Test
	    void testPositiveIntegers() {
	        AdditionCalculator calculator = new AdditionCalculator();
	        assertEquals(8, calculator.add(5, 3));
	    }
	 
	 @Test
	    void testNonIntegerInputs() {
	        AdditionCalculator calculator = new AdditionCalculator();
	        try {
	            calculator.add(5, 1/3);
	            fail("Expected IllegalArgumentException");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Input is not an integer.", e.getMessage());
	        }
	    }

}
