import java.util.*;
interface DetailInfo
{
	abstract void display();
	abstract int count(int a);
}

class Person implements DetailInfo
{
	static int maxcount=0;
	private String name;
	
	Person(String name) 
	{
		this.name=name;
	}
	public int count(int mc)
	{
		for(int i=0;i<name.length();i++)
		{
			mc++;
		}
		return mc;
	}
	public void display()
	{
		int m=count(maxcount);
		System.out.println("Name of the Person:"+name);
		System.out.println("No. of characters present in the name of the person is "+m);
	}
}

public class PROG_8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name of the Person:");
		String name=sc.next();
	
		Person ob1=new Person(name);
		ob1.display();
	}
}