package inheritanceDemo;

public class Payments extends Homepage{
	
	private static inheritanceDemo.payments obj;


	public void payments() {
		System.out.println("test payments page");
	}
	

	public static void main(String[] args) {
		
		Payments.obj = new payments();
		obj.openbrowser("Chrome");
		obj.login("admin", "admin@123");
		obj.Homepagetest();
		obj.payments();
		obj.logout();

	}

}
