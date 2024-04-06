package tdd;

public class AdditionCalculator {
	
	  public int add(int a, int b) {
	        if (a < 0 || b < 0) {
	            throw new IllegalArgumentException("Negative integers are not allowed.");
	        }
	        return a + b;
	    }

}
