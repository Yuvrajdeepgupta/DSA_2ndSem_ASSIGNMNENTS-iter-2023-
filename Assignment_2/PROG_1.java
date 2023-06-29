import java.util.*;
class phone
{
	public int areacode,exchange,number;
	
	public void display()
	{
		System.out.printf("My number is (%d) %d-%d",areacode,exchange,number);
	}
	
	public String input(int areacode,int exchange,int number)
	{
		String s=""+'('+areacode+')'+exchange+'-'+number;
		return s;
	}
}

public class PROG_1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Area-code:");
		int areacode=sc.nextInt();
		System.out.print("Enter the Exchange:");
		int exchange=sc.nextInt();
		System.out.print("Enter the Number:");
		int number=sc.nextInt();
		
		phone ob1=new phone();
		ob1.areacode=212;
		ob1.exchange=767;
		ob1.number=8900;
		ob1.display();
		
		phone ob2=new phone();
		String s=ob2.input(areacode, exchange, number);
		System.out.printf("\nYour number is (%d) %d-%d",areacode,exchange,number);
	}
}