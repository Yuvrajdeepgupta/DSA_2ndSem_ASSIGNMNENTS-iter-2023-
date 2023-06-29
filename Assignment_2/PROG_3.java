import java.util.*;
class Student
{
	private int rollno;
	private String name;
	private int DSA_MARK;
	
	public void getdata(String n,int r,int dm)
	{
		name=n;
		rollno=r;
		DSA_MARK=dm;
	}
	public void Showdata()
	{
		System.out.println("Students Name-"+name);
		System.out.println("Roll No.-"+rollno);
		System.out.println("DSA_MARK-"+DSA_MARK);
	}
}

public class PROG_3
{
	public static void main(String[] args) 
	{
		Student ob1=new Student();
		ob1.getdata("Yuvraj",7,60);
		ob1.Showdata();
		
		Student ob2=new Student();
		ob1.getdata("Aditya",55,43);
		ob1.Showdata();
		
		Student ob3=new Student();
		ob1.getdata("Satyam",23,33);
		ob1.Showdata();
		
		Student ob4=new Student();
		ob1.getdata("Sanket",49,45);
		ob1.Showdata();
		
		Student ob5=new Student();
		ob1.getdata("Subhdeep",16,54);
		ob1.Showdata();
		
		System.out.println("\nTop Scorer-Yuvraj");
	}
}