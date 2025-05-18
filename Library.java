package day2myassignments;


public class Library

{


	
	public String addbook(String bookTitle)
	{
		System.out.println("book added successflly");
		return "book is" +bookTitle;

	}
	
		public void issueBook()
		{
			System.out.println("Book issued successfully");
		}


	


	public static void main(String[] args)
	{
		
		Library br = new Library();
		String b = br.addbook("RAMAYANAM");
		System.out.println(b);	
		br.issueBook();
		
	
	
	
}



	
}



