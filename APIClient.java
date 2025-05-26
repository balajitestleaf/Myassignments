package week3day1.homeassignement1.homeassignment2a;


public class APIClient
{

	
	
	
		public void sendRequest(String endpoint)
		
		{
			
			System.out.println("endpoint"+endpoint);
			
		}
		
		public void sendRequest(String endpoint ,String requestBody,boolean requestStatus)
		{
			
			System.out.println("endpoint" +endpoint);
			System.out.println("requestBody" +requestBody);
			
			if(requestStatus==true)
			{
				
				System.out.println("requestsubmitted");
				
			}
			
			else
				
			{
				System.out.println("requestisnotsubmitted");
			}
			
		}
		
		
		
		
		public static void main(String[] args) 
		
		
		
		{
			APIClient ap = new APIClient();
			ap.sendRequest("testing");
			ap.sendRequest("testing1","body",true);	
					
					


		}

}



	


