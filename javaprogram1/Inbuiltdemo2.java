package javaprogram1;

public class Inbuiltdemo2 extends Datatypes {

	public static void main(String[] args) {
       String title2 = "Practice Labs Java";
        
       
        String result = title2.substring(title2.lastIndexOf(" ") + 1);
        
        
        if (result.equals("Java")) {
            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
	}

}
}
