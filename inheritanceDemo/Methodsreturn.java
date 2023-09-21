package inheritanceDemo;

public class Methodsreturn {
	int x = 100;
	String str3 = "Java";
	
	public int sum()
	{
		int a=10;
		int b=20;
		int result = a+b+x;
		return result;
	}
	public String concatmethod()
	{
		String str1 = "Hello";
		String str2 = "World";
		String result = str1+str2+str3;
		return result;
	}
	
	public void printmethod()
	{
		System.out.println("The global integer value: " +x );
		System.out.println("The global String value: " +str3 );
		
	}

	public static void main(String[] args) {
		
		Methodsreturn obj = new Methodsreturn();
		System.out.println(obj.concatmethod());
		int value = obj.sum();
		
		System.out.println(value);
		
		obj.printmethod();
		
		

	}

}
