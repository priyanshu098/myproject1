package inheritanceDemo;

public class Homepage extends Base{
	
	public void Homepagetest()
	{
		System.out.println("Test");
	}

	public static void main(String[] args) {
		
		Homepage obj = new Homepage();
		
		obj.openbrowser("Chrome");
		obj.login("admin", "admin");
		obj.Homepagetest();
		obj.logout();
		
		

	}

	private void logout() {
		// TODO Auto-generated method stub
		
	}

	private void login(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private void openbrowser(String string) {
		// TODO Auto-generated method stub
		
	}
}
