package blockparametersjava;

public class TryBlockWithParameters {

	public static void main(String[] args) {
		int dividend = 10;
        int divisor = 2;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return dividend / divisor;

	}

}
