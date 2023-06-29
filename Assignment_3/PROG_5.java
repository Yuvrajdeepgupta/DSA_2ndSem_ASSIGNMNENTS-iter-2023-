import java.util.*;
public class PROG_5 
{
	public static <T> int count(T array[],T item)
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==item)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Integer a[]=new Integer[5];
		
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the item to search:");
		int item=sc.nextInt();
		
		int count=count(a,item);
		System.out.println("The number of times "+item+" appears in the Array a "+"is "+count);
	}
}
