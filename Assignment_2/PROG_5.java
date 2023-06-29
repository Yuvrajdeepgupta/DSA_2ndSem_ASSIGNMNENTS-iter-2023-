import java.util.*;
class Deposit 
{
    private long principal;
    private int time;
    private double rate;

    public Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0.0;
    }

    public Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 0.05;
    }

    public Deposit(long principal, double rate) {
        this.principal = principal;
        this.time = 1; 
        this.rate = rate;
    }

    public void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
    }

    public double calc_amt() {
        return principal * Math.pow(1 + rate, time);
    }
}

public class PROG_5 
{
    public static void main(String[] args) {
        Deposit d1 = new Deposit(); 
        Deposit d2 = new Deposit(10000, 2, 0.08); 
        Deposit d3 = new Deposit(5000, 3); 
        Deposit d4 = new Deposit(20000, 0.06); 

        d1.display();
        System.out.println("Total amount: " + d1.calc_amt());

        d2.display();
        System.out.println("Total amount: " + d2.calc_amt());

        d3.display();
        System.out.println("Total amount: " + d3.calc_amt());

        d4.display();
        System.out.println("Total amount: " + d4.calc_amt());
    }
}

