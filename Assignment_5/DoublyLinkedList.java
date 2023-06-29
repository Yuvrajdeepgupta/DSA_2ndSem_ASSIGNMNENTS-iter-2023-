import java.util.Scanner;
class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	protected Node prev;
	
	public Node(int regd_no,float mark) 
	{
		this.regd_no=regd_no;
		this.mark=mark;
		this.next=null;
		this.prev=null;
	}
	public Node() 
	{
		this.next=null;
		this.prev=null;
	}
}
public class DoublyLinkedList 
{
	public static Scanner sc=new Scanner(System.in);
	
	static Node start;
	static Node end;
	
	public static void create()
	{
		int regd_no;
       	        float mark;
       		System.out.print("Enter student registration number (0 to stop): ");
       		regd_no = sc.nextInt();
        while(regd_no!=0)
        {
        	System.out.println("Enter the Marks Secured:");
			mark=sc.nextFloat();
        	Node newnode=new Node(regd_no, mark);
        	
        	if(start==null)
        	{
        		start=newnode;
        		end=newnode;
        	}
        	else
        	{
        		start.prev=newnode;
        		newnode.next=start;
        		end=start;
        		start=newnode;		
        	}
        	System.out.println("Enter student registration number (0 to stop):");
			regd_no=sc.nextInt();
        }
	}
	
	public static Node insBeg()
	{
		System.out.println("Enter student registration number:");
		int regd_no=sc.nextInt();
		System.out.println("Enter the Marks Secured:");
		float mark=sc.nextFloat();
        
        Node newnode=new Node(regd_no, mark);
        if(start==null)
    	{
    		start=newnode;
    		end=newnode;
    	}
    	else
    	{
    		start.prev=newnode;
    		newnode.next=start;
    		start=newnode;		
    	}
        
        return start;
	}
	
	 public static Node insEnd()
	 {
		 	System.out.println("Enter student registration number:");
			int regd_no=sc.nextInt();
			System.out.println("Enter the Marks Secured:");
			float mark=sc.nextFloat();
			
			Node newnode=new Node(regd_no, mark);
			Node temp=start;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
			end=newnode;
			return end;
	 }
	 
	 public static Node insAny()
	 {
		 	System.out.println("Enter student registration number:");
			int regd_no=sc.nextInt();
			System.out.println("Enter the Marks Secured:");
			float mark=sc.nextFloat();
			
			Node temp=start;
			Node newnode=new Node(regd_no, mark);
			System.out.print("Enter the position to insert: ");
	        int pos = sc.nextInt();
	        
	        if (temp == null)
	        {
	        	 System.out.println("Invalid position");
	        }     
	        else 
	        {
	        	for(int i=1;i<pos-1;i++)
	        	{
	        		temp=temp.next;
	        	}
	        	Node temp2=temp.next;
	        	newnode.prev=temp;
	        	temp.next=newnode;
	        	temp2.prev=newnode;
	        	newnode.next=temp2;
	        }
	        return start;
	 }
	 
	 public static Node delBeg()
	 {
		 if(start==end)
		 {
			 start=null;
		 }
		 if (start == null) 
		 {
	            System.out.println("List is empty");
	            return start;
	     }
		 else 
		 {
			 System.out.println("Deleted element: Regd No - " + start.regd_no + ", Mark - " + start.mark);
			 start=start.next;
			 start.prev=null;
		 }
		 return start;
	 }
	 
	 public static Node delEnd()
	 {
		 if(start==end)
		 {
			 start=null;
		 }
		 if (start == null) 
		 {
	            System.out.println("List is empty");
	            return start;
	     }
		 Node temp=start;
		 while(temp.next.next!=null)
		 {
			 temp=temp.next;
		 }
		 System.out.println("Deleted element: Regd No - " + temp.next.regd_no + ", Mark - " + temp.next.mark);
		 temp.next=null;
		 end=temp;
		 return end;
		 
	 }
	 
	 public static Node delAny()
	 {
		 if (start == null) 
		 {
	            System.out.println("List is empty");
	            return start;
	     }
		 System.out.print("Enter the position to delete: ");
	     int pos = sc.nextInt();
	     
	     Node temp=start;
	     Node temp2=temp.next;
	     for(int i=1;i<pos-1;i++)
	     {
	    	 temp=temp.next;
	    	 temp2=temp2.next;
	     }
	     
		 System.out.println("Deleted element: Regd No - " + temp2.regd_no + ", Mark - " + temp2.mark);
		 temp2.next.prev=temp;
		 temp.next=temp2.next;
	     temp2=null;
	     return start;
	 }
	 
	 public static void search()
	 {
		 if (start == null) 
		 {
	            System.out.println("List is empty");
	            return;
	     }
		 int index=0;
		 System.out.println("Enter student registration number:");
	     int regd_no=sc.nextInt();
	     
		 Node temp=start;
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
	 
	 public static void display()
	 {
		 Node temp=start;
		 System.out.println("Student Information:");
	        while (temp != null) 
	        {
	            System.out.println("Regd No: " + temp.regd_no + "\tMark: " + temp.mark);
	            temp = temp.next;
	        }
	 }
	 
	 public static void main(String[] args) 
	 {
	        int choice;
	        while (true) 
	        {	
	            System.out.println("****MENU*****");
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
	            System.out.println("");
	            System.out.println("Enter the choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 0:
	                    System.exit(0);
	                case 1:
	                    create();
	                    break;
	                case 2:
	                    display();
	                    break;
	                case 3:
	                    start = insBeg();
	                    break;
	                case 4:
	                    end = insEnd();
	                    break;
	                case 5:
	                    start = insAny();
	                    break;
	                case 6:
	                    start = delBeg();
	                    break;
	                case 7:
	                    end = delEnd();
	                    break;
	                case 8:
	                    start = delAny();
	                    break;
	                case 9:
	                    search();
	                    break;
	                default:
	                    System.out.println("Wrong choice");
	            }
	        }
	 }
}
