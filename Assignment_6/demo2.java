import java.util.*;
class Stack
{
	int a[];
	int top;
	int capacity;
	
	public Stack(int capacity) 
	{
		this.capacity=capacity;
		this.top=-1;
		a=new int[capacity];
	}
	
	public void push(int data) 
	{
		if(top==(capacity-1))
		{
			System.out.println("Stack is Empty!");
		}
		top++;
		a[top]=data;
	}
	
	public int pop()
	{
		if(top==(capacity-1))
		{
			System.out.println("Stack is Empty!");
		}
		int temp=a[top];
		top--;
		return temp;
	}
	
	public int peek()
	{
		if(top==(capacity-1))
		{
			System.out.println("Stack is Empty!");
		}
		return a[top];
	}
	
	public boolean isEmpty()
	{
		if(top==(capacity-1))
		{
			return true;
		}
		else {return false;}
	}
	
	public int capacity()
	{
		return capacity;
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println("___");
			System.out.println("|"+a[i]+"|");
		}
	}
}

public class demo2 
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack(10);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.display();
		System.out.println("\n"+s1.pop());
		s1.display();
		System.out.println("\n"+s1.peek());
		System.out.println("\n"+s1.capacity());
	}
}
