import java.util.*;
class Complex
{
	private int real;
	private int imaginary;
	
	public void setData(int r,int i)
	{
		real=r;
		imaginary=i;
	}
	 public void display() 
	 {
	    System.out.print(real+" + "+imaginary+"i");
	 }

	  public Complex add(Complex c) 
	  {
	       Complex result = new Complex();
	       result.real = this.real + c.real;
	       result.imaginary = this.imaginary + c.imaginary;
	       return result;
	  }
}

public class PROG_2
{
	public static void main(String[] args) 
	{
			Complex c1 = new Complex();
	        c1.setData(2,3);

	        Complex c2 = new Complex();
	        c2.setData(1,2);

	        Complex sum = c1.add(c2);

	        System.out.print("Sum of ");
	        c1.display();
	        System.out.print(" and ");
	        c2.display();
	        System.out.print(" is ");
	        sum.display();
	        
	}
}