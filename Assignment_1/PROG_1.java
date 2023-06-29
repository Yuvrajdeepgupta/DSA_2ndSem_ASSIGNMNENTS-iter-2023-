import java.util.*;
public class PROG_1 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		
		if(a>2)
		{
			System.out.println("Please enter a no. greater than 2!");
		}
		
		int temp=0,k=0;
		while(a>2)
		{
			a=a/2;
			temp++;
		}
		
System.out.printf("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is %d.",temp);
	}

}
