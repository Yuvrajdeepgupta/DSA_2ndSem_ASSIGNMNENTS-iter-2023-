import java.util.*;
public class PROG_10 
{
	public static double sumColumn(double A[][], int columnIndex) 
	{
		double sum=0;
		for(int i=0;i<A[columnIndex].length;i++)
		{
			sum+=A[columnIndex][i];
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		double A[][]= {{23,43,1.98,3},{45,76,8,9},{54.5,3,2,1,9,23}};
		
		System.out.println("The Given Array is:");
		for(double x[]:A)
		{
			for(double y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("The sum of each column is:");
		for(int i=0;i<A.length;i++)
		{
			
			double sum=sumColumn(A, i);
			System.out.println("The Sum of "+i+" Column is "+sum);
		}
	}

}
