package week3day1.homeassignement1;

public class LoginTestData extends Testdata
{ 
	
	
	
		public void enterUsername()
		
		{
			System.out.println("BALAJI");
		}
		
		public void enterPassword()
		
		{
			System.out.println("sriram");
		}

	

public static void main(String[] args) 

{
	LoginTestData Lt = new LoginTestData();
	Lt.enterCredentials();
	Lt.navigateToHomePage();
	Lt.enterUsername();
	Lt.enterPassword();
	
}


}
