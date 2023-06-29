package P1;
import p2.*;
import java.util.*;

 class Student 
{
    int rollNumber;
    String name;
    String course;
    
    public void input_student() 
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

   public void output_student() 
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class Test extends Student 
{
   public int mark1;
   public int mark2;
   public int mark3;

  public void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Marks for Subject 3: ");
        mark3 = sc.nextInt();
    }

   public void output() 
    {
        System.out.println("Marks for Subject 1: " + mark1);
        System.out.println("Marks for Subject 2: " + mark2);
        System.out.println("Marks for Subject 3: " + mark3);
    }
}