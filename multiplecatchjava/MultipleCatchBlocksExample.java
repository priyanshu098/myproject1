package multiplecatchjava;

public class MultipleCatchBlocksExample {

	public static void main(String[] args) {
		try {
            int[] numbers = { 1, 2, 3 };
            int result = numbers[4]; 
            System.out.println("Result: " + result); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }


}
