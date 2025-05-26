package week3day1.weekdayhomeassignement2b;


public class BasePage

{

		    public void findElement()
			{
				System.out.println("findelement");
			}
			
			public void clickElement()
			
			{
				System.out.println("clickelement");
				
			}
			public void enterText()
			{
				System.out.println("entertext");
			}
			
			public void performCommonTasks()
			
			{
				System.out.println("performCommonTasks");
				
			}
			
			
			
			public static void main(String[] args)
			{
				BasePage p=new BasePage ();
				p.findElement();
				p.clickElement();
				p.enterText();
				
			}
		}


	

