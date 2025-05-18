package day2myassignments;

public class Librarymanagement {

	public static void main(String[] args)
	
	{
		Library br = new Library();
		String b = br.addbook("RAMAYANAM");
		System.out.println(b);	
		br.issueBook();
		

	}

}
