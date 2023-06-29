import java.util.*;
public class PROG_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a[]=new String[5];
		try 
		{			
			a[0]="Red";
			a[1]="Blue";
			a[2]="Green";
			a[3]="Yellow";
			System.out.println("Enter one more colour:");
			String str=sc.next();
			Integer.parseInt(str);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			a[4]="White";
		}
		try 
		{
			System.out.println("Enter one More Colour:");
			a[5]="Violet";
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
	}
}
