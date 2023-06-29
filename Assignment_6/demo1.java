import java.util.*;
public class demo1 
{
	public static void main(String[] args)
	{
		Stack<Integer> s1=new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek()+" "+s1.capacity());
	}
}
