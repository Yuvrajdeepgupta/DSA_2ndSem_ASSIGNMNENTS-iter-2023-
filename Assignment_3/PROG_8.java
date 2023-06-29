public class PROG_8
{
    public static void main(String[] args) 
    {
        int n = 4735;
        System.out.print("Original number: " + n);
        System.out.print("\nReversed number: ");
        reverseDigits(n);
    }

    public static void reverseDigits(int n) 
{
        if (n < 10) 
	  {
            System.out.print(n);
        } 
	  else 
	  {
            System.out.print(n % 10);
            reverseDigits(n / 10);
        }
    }
}
