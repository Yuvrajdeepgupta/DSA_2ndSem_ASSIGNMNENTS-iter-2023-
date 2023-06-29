import java.util.*;

class Node
{
	int info;
	Node next;
	public Node(int info)
	{
		this.info=info;
		this.next=null;
	}	
}

public class StackDemo2 
{
	public static Scanner sc=new Scanner(System.in);
	static Node top;
	
	public static Node push(Node top)
	{
		System.out.println("Enter the New Info:");
		int info=sc.nextInt();
		
		Node newnode=new Node(info);
		newnode.next=top;
		top=newnode;
		return top;
	}
	
	public static Node pop(Node top) throws NullPointerException
	{
		try 
		{
			if(top==null)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Node temp=top;
		System.out.println("Removed Element:"+temp.info);
		top=top.next;
		return top;
	}
	
	public static void display(Node top)
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println("___");
			System.out.println("|"+temp.info+"|");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			
			switch(choice)
	 		{
	 			case 0:
	 				System.exit(0);
	 			case 1:
	 				top=push(top);
	 				break;
	 			case 2:
	 				top=pop(top);
	 				break;
	 			case 3:
	 				display(top);
	 				break;
	 			default:
	 				System.out.println("Invalid choice");
	 				break;
	 		}
		}
	}
}
