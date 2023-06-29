import java.util.*;
abstract class Shape
{
	abstract void area();
}

class Square extends Shape
{
	private int side;
	public Square(int side) 
	{
		this.side=side;
	}
	void area()
	{
		System.out.println("Area of Sqaure:"+side*side+"\n");
	}
}

class Triangle extends Shape
{
	private int base;
	private int height;
	public Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	void area()
	{
		System.out.println("Area of Triangle:"+(0.5*base*height)+"\n");
	}
}

class Circle extends Shape
{
	private int radius;
	public Circle(int radius) 
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("Area of a Circle:"+(Math.PI*radius*radius)+"\n");
	}
}

public class PROG_6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Side of the Square:");
		int s=sc.nextInt();
		System.out.print("Enter the Base and Height of the Triangle:");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.print("Enter the Radius of the Circle:");
		int r=sc.nextInt();
		
		Square ob1=new Square(s);
		ob1.area();
		
		Triangle ob2=new Triangle(b,h);
		ob2.area();
		
		Circle ob3=new Circle(r);
		ob3.area();
	}
}
