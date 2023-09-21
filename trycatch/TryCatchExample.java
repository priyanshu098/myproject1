package trycatch;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
            
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }

        
        System.out.println("Program continues after the exception.");

	}

}
