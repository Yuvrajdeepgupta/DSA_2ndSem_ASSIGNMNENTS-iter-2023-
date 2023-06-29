import java.util.*;
public class PROG_8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the No. of Rows:");
		int row=sc.nextInt();
		
		System.out.print("Enter the No. of Colums:");
		int column=sc.nextInt();
		
		int A[][]=new int[row][column];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The 2D Array is:");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				int temp=A[i][j];
				sum+=temp;
			}
		}
		
		System.out.println("The sum of elements of the 2D-Array is "+sum);
				
	}
}
