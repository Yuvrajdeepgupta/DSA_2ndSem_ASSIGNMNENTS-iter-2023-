import java.util.*;
public class QueueDemo1 
{
	public static final int MAX=5;
	public static int front=-1;
	public static int rear=-1;
	public static Scanner sc=new Scanner(System.in);
	
	public static void insert(int Q[])
	{
		System.out.println("Enter the Element to Add:");
		int element=sc.nextInt();
		
		if(front==-1 && rear==-1)
		{
			front++;
			rear++;
			Q[rear]=element;
		}
		else if(rear==(MAX-1))
		{
			System.out.println("Stack Overflow!");
		}
		else
		{
			rear++;
			Q[rear]=element;
		}
	}
	
	public static void delete(int Q[])
	{
		if(front==-1 && rear==-1 || front==(rear+1))
		{
			System.out.println("Underflow!");
			return;
		}
		else 
		{
			front++;
		}
	}
	
	public static void display(int Q[])
	{
		for(int i=front;i<=rear;i++)
		{   
			System.out.print(Q[i]+"->");
		}
		System.out.println("End\n");
	}
	
	public static boolean is_full()
	{
		if(rear==(MAX-1)) {return true;}
		else {return false;}
	}
	
	public static boolean is_empty()
	{
		if(rear==-1 && front==-1 || front==(rear+1))
		{
			return true;
		}
		else {return false;}
	}
	
	public static void main(String[] args) 
	{
		 int queue[]=new int[MAX];

		 while(true)
		 {
			 System.out.println("***MENU***");
			 System.out.println("0: Exit");
			 System.out.println("1: Insert");
			 System.out.println("2: Delete");
			 System.out.println("3: Display");
			 System.out.println("4: Check if Queue is Empty");
			 System.out.println("5: Check if Queue is Full");
		 	 System.out.println("\nEnter your choice:");
			 int choice=sc.nextInt();
			 switch(choice) 
			 {
			 	case 0:
	 				System.exit(0);
	 			case 1:
	 				insert(queue);
	 				break;
	 			case 2:
	 				delete(queue);
	 				break;
	 			case 3:
	 				display(queue);
	 				break;
	 			case 4:
	 				boolean t=is_empty();
	 				System.out.println(t);
	 				break;
	 			case 5:	
	 				boolean t1=is_full();
	 				System.out.println(t1);
	 				break;
	 			default:
	 				System.out.println("Invalid choice");
	 				break;
			 }
		 }
	}
}
