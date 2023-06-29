import P1.*;
import p2.*;
import java.util.*;

public class PROG_10 implements Sports
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Test obj1=new Test();
		obj1.input_student();
		obj1.input();
		
		int GrandTotalMarks=obj1.mark1+obj1.mark2+obj1.mark3;
		
		int Score=score1+score2;
		
		System.out.println("Grand Total Marks is:"+GrandTotalMarks);
		System.out.println("Score:"+Score);
	}
}