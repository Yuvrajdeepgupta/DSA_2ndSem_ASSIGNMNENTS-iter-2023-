import java.util.*;
public class PROG_3 
{
	public static boolean SpyNumber(int n)
	{
		int sum=0,t=n;
		while(t>0) 
		{
			int temp=t%10;
			sum+=temp;
			t=t/10;
		}
		
		int product=1;
		while(n>0)
		{
			int temp=n%10;
			product*=temp;
			n=n/10;
		}
		
		if(sum==product) {return true;}
		return false;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		
		int number=sc.nextInt();
		
		if(SpyNumber(number))
		{
			System.out.println("The number is a Spy number.");
		}
		else 
		{
			System.out.println("The number is Not a Spy number.");
		}
	}
}
