import java.util.*;
public class StackDemo1 
{
	static final int MAX=10;
	static int Stack[]=new int[MAX];
	static int top=-1;
	
	public static Scanner sc=new Scanner(System.in);
	
	public static int push(int S[],int top)
	{
		try 
		{
		    if(top>MAX)
			{
				throw new StackOverflowError();
			}
		}
		catch(StackOverflowError e)
		{
			System.out.println(e);
		}
		
		System.out.println("Enter the Element to Add:");
		int x=sc.nextInt();
		top++;
		S[top]=x;
		return top;
	}
	
	public static int pop(int S[])
	{
		try 
		{
			 if(top==-1)
			{
				throw new Exception("StackUnderflowError");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int x=S[top];
		System.out.println("Removed Element:"+x+"  Index:"+top);
		top--;
		return x;
	}
	
	public static void display(int S[],int top)
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println("___");
			System.out.println("|"+S[i]+"|");
		}
	}
	
	public static boolean isEmpty(int top)
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isFull(int top) 
	{
		if(top==(MAX-1))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
		 	while(true)
		 	{

		 		System.out.println("***MENU***");
		 		System.out.println("0: Exit");
		 		System.out.println("1: Push");
		 		System.out.println("2: Pop");
		 		System.out.println("3: Display");
		 		System.out.println("4: Check if Stack is Empty");
		 		System.out.println("5: Check if Stack is Full");
		 		System.out.println("\nEnter your choice:");
		 		int choice=sc.nextInt();
		 		
		 		switch(choice)
		 		{
		 			case 0:
		 				System.exit(0);
		 			case 1:
		 				top=push(Stack, top);
		 				System.out.println(top);
		 				break;
		 			case 2:
		 				System.out.println(top);
		 				int x=pop(Stack);
		 				System.out.println(top);
		 				break;
		 			case 3:
		 				display(Stack, top);
		 				break;
		 			case 4:
		 				boolean t=isEmpty(top);
		 				System.out.println(t);
		 				break;
		 			case 5:	
		 				boolean t1=isFull(top);
		 				System.out.println(t1);
		 				break;
		 			default:
		 				System.out.println("Invalid choice");
		 				break;
		 		}
		 	}
	}
}
