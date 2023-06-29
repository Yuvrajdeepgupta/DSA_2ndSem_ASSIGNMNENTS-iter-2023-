import java.util.*;
public class PROG_6 
{
	public static boolean isOdd(int i) 
	{
	    boolean k=(i & 1) == 1;
	    
	    if(k) {return true;}
	    else {return false;}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int i=sc.nextInt();
		
		System.out.println(i+" is Odd:"+isOdd(i));
	}
}
