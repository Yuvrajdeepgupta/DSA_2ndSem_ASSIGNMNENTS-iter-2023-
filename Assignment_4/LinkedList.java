import java.util.*;
class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	public Node(int regd_no,float mark) 
	{
		this.regd_no=regd_no;
		this.mark=mark;
		this.next=null;
	}
}

public class LinkedList
{
	public static Scanner sc=new Scanner(System.in);
	
	static Node start;
	
	public static void create()
	{
		Node temp=start;
		float mark=0;
		System.out.println("Enter student registration number (0 to stop):");
		int regd_no=sc.nextInt();
		while(regd_no!=0)
		{
			System.out.println("Enter the Marks Secured:");
			mark=sc.nextFloat();
			Node newnode=new Node(regd_no, mark);
			
			if(start==null)
			{
				start=newnode;
				temp=start;
			}
			else
			{
				temp.next=newnode;
				temp=newnode;
			}
			System.out.println("Enter student registration number (0 to stop):");
			regd_no=sc.nextInt();
		}
	}
	
	public static void InsBeg()
	{
		System.out.println("Enter student registration number:");
		int regd_no=sc.nextInt();
		System.out.println("Enter the Marks Secured:");
		float mark=sc.nextFloat();
		
		Node newnode=new Node(regd_no, mark);
		newnode.next=start;
		start=newnode;
	}
	
	public static void InsEnd()
	{
		System.out.println("Enter student registration number:");
		int regd_no=sc.nextInt();
		System.out.println("Enter the Marks Secured:");
		float mark=sc.nextFloat();
		
		Node newnode=new Node(regd_no, mark);
		newnode.next=null;
		Node temp=start;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
	}
	
	public static void InsAny()
	{
		System.out.println("Enter student registration number:");
		int regd_no=sc.nextInt();
		System.out.println("Enter the Marks Secured:");
		float mark=sc.nextFloat();
		
		Node newnode=new Node(regd_no, mark);
		System.out.print("Enter the position to insert: ");
        int pos = sc.nextInt();
        
        Node temp=start;
        for(int i=1;i<pos-1;i++)
        {
        	temp=temp.next;
        }
        Node temp2=temp.next;
        temp.next=newnode;
        newnode.next=temp2;
	}
	
	public static void DelBeg()
	{
		 if (start == null)
		 {
	          System.out.println("List is empty");
	     }
	     System.out.println("Deleted element: Regd No - " + start.regd_no + ", Mark - " + start.mark);
	     start = start.next;
	}
	
	public static void DelEnd()
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		
		if (start.next == null) 
	    {
	        System.out.println("Deleted element: Regd No - " + start.regd_no + ", Mark - " + start.mark);
	        start = null;
	    }
		
		Node temp=start;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	
	public static void DelAny()
	{
		Node temp=start;
		int count=0;
		System.out.println("Enter student registration number:");
		int regd_no=sc.nextInt();
		
		while(temp.regd_no!=regd_no)
		{
			count++;
			temp=temp.next;	
			
		}
		if(temp.next==null) {System.out.println("Element not found!");}
		temp=start;
		for(int i=1;i<count-1;i++)
		{
			temp=temp.next;
		}
		Node x=temp.next,z=x;
		temp.next=temp.next.next;
		x.next=null;
		System.out.println("Deleted element: Regd No - " + z.regd_no + ", Mark - " + z.mark);
	}
	
	 public static void search()
	 {
		 Node temp=start;
		 int index=0;
		 System.out.println("Enter student registration number:");
	     int regd_no=sc.nextInt();
	     
	     while(temp.regd_no!=regd_no)
			{
	    	 	index++;
				temp=temp.next;	
				
			}
	     if(temp.next==null) {System.out.println("Element not found!");}
	     temp=start;
	     for(int i=1;i<=index;i++)
	     {
	    	 temp=temp.next;
	     }
	     System.out.println("Current Mark: " + temp.mark);
         System.out.print("Enter new mark: ");
         float newMark = sc.nextFloat();
         temp.mark = newMark;
         System.out.println("Mark updated successfully");
	 }

	 public static void sort()
	 {
		 Node i,j;
		 float mark;
		 int regd_no;
		 
		 if (start == null) 
		 {
	        System.out.println("List is empty");
	        return;
	     }
		 
		 for(i=start;i!=null;i=i.next)
		 {
			 for(j=i.next;j!=null;j=j.next)
			 {
				 if(i.mark<j.mark)
				 {
					 float temp=i.mark;
					 i.mark=j.mark;
					 j.mark=temp;
					 
					 int temp2=i.regd_no;
					 i.regd_no=j.regd_no;
					 j.regd_no=temp2;
				 }
			 }
		 }
	     System.out.println("List sorted in descending order of marks");

	 }
	 
	 public static int count()
	 {
		 	Node temp = start;
	        int count = 0;
	        while (temp != null) 
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	 }
	 
	 public static void reverse()
	 {
		 Node cur=start;
		 Node prev=null;
		 while(cur!=null)
		 {
			 Node temp=cur.next;
			 cur.next=prev;
			 prev=cur;
			 cur=temp;
		 }
		 start = prev;
	     System.out.println("List reversed successfully");
	 }
	 
	 public static void display()
	 {
		 Node temp=start;
		 while(temp!=null)
		 {
			 System.out.println("Regd_no.->"+temp.regd_no+"  "+"Marks Obtained->"+temp.mark);
			 temp=temp.next;
		 }
	 }
	 
	 public static void main(String[] args) 
	 {
		 int choice;
	        while (true) 
	        {
	            System.out.println("\n****MENU*****");
	            System.out.println("0: Exit");
	            System.out.println("1: Creation");
	            System.out.println("2: Display");
	            System.out.println("3: Insert at the beginning");
	            System.out.println("4: Insert at the end");
	            System.out.println("5: Insert at any position");
	            System.out.println("6: Delete from the beginning");
	            System.out.println("7: Delete from the end");
	            System.out.println("8: Delete from any position");
	            System.out.println("9: Search and update mark");
	            System.out.println("10: Sort based on marks");
	            System.out.println("11: Count number of nodes");
	            System.out.println("12: Reverse the list");
	            System.out.println("Enter the choice: ");
	            choice = sc.nextInt();
	            
	            switch(choice)
	            {
	            case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    InsBeg();
                    break;
                case 4:
                    InsEnd();
                    break;
                case 5:
                    InsAny();
                    break;
                case 6:
                    DelBeg();
                    break;
                case 7:
                	DelEnd();
                    break;
                case 8:
                    DelAny();
                    break;
                case 9:
                    search();
                    break;
                case 10:
                    sort();
                    break;
                case 11:
                    System.out.println("Number of nodes: " + count());
                    break;
                case 12:
                    reverse();
                    break;
                default:
                    System.out.println("Wrong choice");
	            }
	        }
	 }
}
