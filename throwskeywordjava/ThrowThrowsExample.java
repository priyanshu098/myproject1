package throwskeywordjava;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowThrowsExample {

	public static void throwCustomException() throws CustomException {
        throw new CustomException("This is a custom exception.");
    }

    public static void methodWithThrows() throws ArithmeticException, NullPointerException {
        int result = 10 / 0;
        String str = null;
        int length = str.length();
    }

    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }

        try {
            methodWithThrows(); 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

}
}
