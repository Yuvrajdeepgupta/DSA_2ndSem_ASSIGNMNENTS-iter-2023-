import java.util.*;
class NumberFormatException extends Exception
{
	private int n;
	public NumberFormatException(String msg) 
	{
		super(msg);
	}
}

public class PROG_1 
{
	public static void main(String[] args) throws NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your lucky number:");
		int l=sc.nextInt();
		
		try 
		{
			if(l>0)
			{
				System.out.println("Your lucky number is "+l);
			}
			else
			{
				throw new NumberFormatException("Negative number");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException: Negative number");
		}
	}
}
