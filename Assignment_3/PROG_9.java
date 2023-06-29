import java.util.*;
public class PROG_8
{
	public static int FibonnaciNthterm(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		else 
		{
			return FibonnaciNthterm(n-1)+FibonnaciNthterm(n-2);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term of the Fibonacci series:");
		int n=sc.nextInt();
		int nth=FibonnaciNthterm(n);
		System.out.printf("The %dth term of Fibonacci series is %d",n,nth);
		
	}
}