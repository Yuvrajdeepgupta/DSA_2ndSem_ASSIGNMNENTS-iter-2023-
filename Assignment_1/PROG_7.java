import java.util.*;
public class PROG_7 
{
	public static int[] sorting(int A[])
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]>A[i]) 
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		return A;
	}
	
	public static int OccurenceOfElements(int A[],int e)
	{
		int count=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==e)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int positionOfOccurenceMax(int A[],int max)
	{
		int count1=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==max)
			{
				count1=i;
				break;
			}
		}
		return count1;
	}
	
	public static int positionofOccurenceMin(int A[],int min)
	{
		int count2=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==min)
			{
				count2=i;
				continue;
			}
		}
		return count2;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array Length:");
		int n=sc.nextInt();
		
		int A[]=new int[n];
		
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		
		System.out.println("The Array is:\n"+Arrays.toString(A));
		
		int B[]=A;
		int C[]=sorting(A);
		
		int max=C[0],min=C[C.length-1];
		
System.out.println("Maximum element of Array is "+max+" and occurs "+OccurenceOfElements(B,max)+" times.");
System.out.println("Minimum element of Array is "+min+" and occurs "+OccurenceOfElements(B,min)+" times.");
System.out.println("First occurrence of maximum element is at position "+positionOfOccurenceMax(B,max));
System.out.println("Last occurrence of minimum element is at position "+positionofOccurenceMin(D,min));
		
	}

}
