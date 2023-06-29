import java.util.*;
class Product
{
	private String pid;
	private double price;
	public static int tot_price;
	
	public Product(String pid,double price) 
	{
		this.pid=pid;
		this.price=price;
		tot_price+=price;
	}
	
	public void display()
	{
		 System.out.println("Product ID: " + pid + ", Price: " + price);
	}
	
}

public class PROG_4 
{
	public static void main(String[] args) 
	{
		Product product1 = new Product("P001", 100);
        Product product2 = new Product("P002", 200);
        Product product3 = new Product("P003", 150);
        Product product4 = new Product("P004", 300);
        Product product5 = new Product("P005", 250);
        
        System.out.println("Details of Purchased Products:");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();
        
        int tot_price=Product.tot_price;
        System.out.println("Total Amount to be Paid: " + tot_price);
	}
}
