import java.util.*;
class Student1 
{
    int rollNumber;
    String name;
    String course;
    
     void input_Student() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Course: ");
        course = scanner.nextLine();
    }

    void display_Student() 
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends Student1 
{
    int mark1;
    int mark2;
    int mark3;

    void input_Marks() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Marks for Subject 3: ");
        mark3 = sc.nextInt();
    }

    void display_Result() 
    {
        System.out.println("Marks for Subject 1: " + mark1);
        System.out.println("Marks for Subject 2: " + mark2);
        System.out.println("Marks for Subject 3: " + mark3);
    }
}
public class PROG_9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		Exam list[]=new Exam[5];
	
		for(int i=0;i<list.length;i++)
		{
			System.out.println("Enter Details for Student " + (i + 1));
			list[i]=new Exam();
			list[i].input_Student();
			list[i].input_Marks();
			System.out.println("");
		}
		
		for(int i=0;i<list.length;i++)
		{
			list[i].display_Student();
			list[i].display_Result();
			System.out.println("");
		}
	}
}