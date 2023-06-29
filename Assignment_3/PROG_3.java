import java.util.*;
class MarksOutOfBoundException extends Exception
{
	public MarksOutOfBoundException() 
	{
		System.out.println();
	}
}
class Student 
{
	private String name;	
	private int mark;
	
	public Student(String name,int mark) 
	{
		this.name=name;
		this.mark=mark;
	}
	public void getMark() throws MarksOutOfBoundException
	{
			if(mark>100)
			{
				throw new MarksOutOfBoundException();
			}
			else
			{
				System.out.println(name+" has got "+mark+" Marks");
			}
	}				
}

public class PROG_3 
{
	 public static void main(String[] args) 
	 {
		 	Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Name:");
			String s=sc.next();
			System.out.print("Enter the Marks:");
			int m=sc.nextInt();
			
			Student obj1=new Student(s,m);
			try 
			{
				obj1.getMark();
			}
			catch(MarksOutOfBoundException e)
			{
				System.out.println("MarksOutOfBoundException: Mark can't be greater than 100");
			}	
	 }
}
