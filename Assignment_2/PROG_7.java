import java.util.*;
class Person
{
	public String name;
	public int age;
	public Person(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
}

class employee extends Person
{
	private int Eid;
	private double salary;
	public employee(String name,int age,int Eid,double salary) 
	{
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	
	void empDisplay()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Eid:"+Eid);
		System.out.println("Salary:"+salary);
	}
}

public class PROG_7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name of the Employee:");
		String n=sc.next();
		System.out.print("Enter the Age of the Employee:");
		int a=sc.nextInt();
		System.out.print("Enter the Eid:");
		int e=sc.nextInt();
		System.out.print("Enter the Salary of the Employee:");
		double s=sc.nextDouble();
		
		employee ob1=new employee(n,a,e,s);
		ob1.empDisplay();
	}
}