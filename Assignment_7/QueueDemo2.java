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
public class QueueDemo2 
{
	public static Scanner sc=new Scanner(System.in);
	static Node rear=null,front=null;
	
	public static Node insert()
	{
		System.out.println("Enter the Info:");
		int info=sc.nextInt();
		
		Node newnode=new Node(info);
		if(rear==null)
		{
			rear=newnode;
			front=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		return front;
	}
	
	public static Node delete() 
	{
		 	if(front==null) 
		 	{
	            System.out.println("Queue is empty.");
	            return null;
	        }
		
		 	Node temp=front;
	        front=front.next;

	        if(front==null) 
	        {
	            rear=null;
	        }

	        temp.next = null;
	        return temp;
	}
	
	public static void display()
	{
		if(front==null) 
		{
            System.out.println("Queue is empty.");
            return;
        }

		Node temp=front;
		while(temp!=null)
		 {
				 System.out.print(temp.info+"->");
			   	temp=temp.next;

		 }
		System.out.println("End");
	}

	public static void main(String[] args) 
	{
		 while(true)
		 {
			 System.out.println("****MENU****");
			 System.out.println("0:Exit");
			 System.out.println("1:Insert");
			 System.out.println("2:Delete");
			 System.out.println("3:Display");
			 System.out.println("\nEnter your choice:");
			 int choice=sc.nextInt();
			 switch(choice)
			 {
			 case 0:
	 				System.exit(0);
	 			case 1:
	 				insert();
	 				break;
	 			case 2:
	 				Node temp=delete();
	 				System.out.println("Deleted element: " + temp.info);
	 				break;
	 			case 3:
	 				display();
	 				break;
	 			default:
	 				System.out.println("Invalid choice");
	 				break;
			 }
		 }
	}
}
