//9 program
// Main class
public class P9 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Check if denominator is zero
            if (denominator == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed!");
            }
            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            // Handle custom exception
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Code in this block always executes
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }
}

// Custom exception class for DivisionByZero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message); // Pass the error message to the parent Exception class
    }
}
