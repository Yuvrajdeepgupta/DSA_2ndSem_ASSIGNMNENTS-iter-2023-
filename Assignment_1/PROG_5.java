import java.util.*;
public class PROG_5 
{	
	public static int SumofDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int temp=n%10;
			sum+=temp;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=sc.nextInt();
		
			int temp=0;
			while(n>10)
			{
				n=SumofDigits(n);
				temp=n;
			}
			
System.out.printf("Sum of digits of %d until the number is a single digit is %d",n,temp);
	}

}
