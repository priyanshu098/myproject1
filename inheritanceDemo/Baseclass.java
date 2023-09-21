package inheritanceDemo;

public class Baseclass {
	public void openbrowser(String browser) {
		System.out.println("open the browser" +browser);
	}
	
	public void login(String username,String password)
	{
		System.out.println("enter username:" + username);

		System.out.println("enter password:" + password);

		System.out.println("sign in");
	}
	public void logout()
	{
		System.out.println("logout");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
