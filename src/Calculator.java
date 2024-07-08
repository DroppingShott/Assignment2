public class Calculator {

    // Method to divide two numbers
    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}
