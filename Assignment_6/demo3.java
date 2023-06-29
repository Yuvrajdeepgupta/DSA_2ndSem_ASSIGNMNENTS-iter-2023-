class stack1
{
	Node head;
	int size;
	public stack1() 
	{
		this.size=0;
	}
	
	class Node
	{
		int data;
		Node next;
		public Node(int data) 
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void push(int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		size++;
	}
		
	public int pop()
	{
		if(head==null) {System.out.println("List is Empty!");}
		Node temp=head;
		int temp2=temp.data;
		head=head.next;
		size--;
		return temp2;
	}
	
	public int peek()
	{
		return head.data;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println("___");
			System.out.println("|"+temp.data+"|");
			temp=temp.next;
		}
	}
}


public class demo3 
{
	public static void main(String[] args) 
	{
		stack1 s1=new stack1();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.display();
		System.out.println("\n"+s1.pop());
		s1.display();
		System.out.println("\n"+s1.peek());
		
	}
}
