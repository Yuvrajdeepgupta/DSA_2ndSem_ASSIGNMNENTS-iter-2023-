import java.util.*;
public class PROG_4 
{
	public static <E> void printArray(E inputArray[])
	{
		for(E element:inputArray)
		{
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Integer a[]=new Integer[5];
		String b[]=new String[5];
		
		System.out.println("Enter the Array1 Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Array2 Elements:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.next();
		}
		
		System.out.println("Integer Array Contains:");
		printArray(a);
		System.out.println("String Array Contains:");
		printArray(b);
	}
}
