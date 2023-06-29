import java.util.*;
public class PROG_9
{
	public static double sumMajorDiagonal(double m[][])
	{
		double sum=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				if(i==j) 
				{
					double temp=m[i][j];
					sum+=temp;
				}
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		double m[][]= {{1,2,3,4.0},{5,6.5,7,8},{9,10,11,12},{13,14,15,16}};
		
		System.out.println("The given Array is:");
		for(double x[]:m)
		{
			for(double y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
		
System.out.println("\nSum of the elements in the major diagonal is: \n"+sumMajorDiagonal(m));
	}
}
