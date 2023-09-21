package typecastingjava;

public class typecasting1 {

	public static void main(String[] args) {
		 int numInt = 10;
	        double numDouble = numInt; 
	        System.out.println("Implicit Type Casting (Widening):");
	        System.out.println("int to double: " + numDouble);

	        double doubleNum = 15.75;
	        int intNum = (int) doubleNum; 
	        System.out.println("\nExplicit Type Casting (Narrowing):");
	        System.out.println("double to int: " + intNum);

	       
	        int largeNum = 1000;
	        byte smallNum = (byte) largeNum; 
	        System.out.println("\nExplicit Type Casting with Possible Data Loss:");
	        System.out.println("int to byte: " + smallNum);
	        
	        char charValue = 'A';
	        int intValue = (int) charValue; 
	        System.out.println("\nExplicit Type Casting for Char to Int:");
	        System.out.println("char to int: " + intValue);
	    }

	}

