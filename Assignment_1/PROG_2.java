import java.util.*;
public class PROG_2 
{
	public static double BMI(int w,double h)
	{
		double bmi=w/(h*h);
		return bmi;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Weight:");
		int w=sc.nextInt();
		System.out.print("Enter the Height:");
		double h=sc.nextDouble();
		
		double bmi=BMI(w, h);
		
		if(bmi>18.5 && bmi<=24.9)
		{
			System.out.println("The person is Normal Weight.");
		}
		else if(bmi>25 && bmi<=29.9)
		{
			System.out.println("The person is Overweight.");
		}
		else if(bmi>30)
		{
			System.out.println("The person is Obese.");
		}
		else if(bmi<18.5)
		{
			System.out.println("The person is Underweight.");
		}
	}

}
