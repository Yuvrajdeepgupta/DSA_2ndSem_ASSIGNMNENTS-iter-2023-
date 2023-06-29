import java.util.Scanner;

public class PROG_7
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("Menu:");
            System.out.println("1. Determine the factorial of a number");
            System.out.println("2. Determine XN for two numbers X, N");
            System.out.println("3. Determine GCD of two numbers");
            System.out.println("4. Convert decimal number to binary");
            System.out.println("5. Calculate the product of two numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = scanner.nextInt();
                    int factorialResult = factorial(num1);
                    System.out.println("Factorial of " + num1 + " is " + factorialResult);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Enter the base number: ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the exponent: ");
                    int exponent = scanner.nextInt();
                    int powerResult = power(base, exponent);
                    System.out.println(base + " raised to the power of " + exponent + " is " + powerResult);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    int num2 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num3 = scanner.nextInt();
                    int gcdResult = gcd(num2, num3);
                    System.out.println("GCD of " + num2 + " and " + num3 + " is " + gcdResult);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimal = scanner.nextInt();
                    String binaryResult = decimalToBinary(decimal);
                    System.out.println("Binary equivalent of " + decimal + " is " + binaryResult);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.print("Enter the first number: ");
                    int num4 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num5 = scanner.nextInt();
                    int productResult = multiply(num4, num5);
                    System.out.println("Product of " + num4 + " and " + num5 + " is " + productResult);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("\n");
                    break;
            }
        } while (choice != 6);
    }

    public static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }

    public static int power(int x, int n) 
    {
        if (n == 0) 
        {
            return 1;
        } 
        else if (n < 0) 
        {
            return 1 / power(x, -n);
        } 
        else 
        {
            return x * power(x, n - 1);
        }
    }

    public static int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static String decimalToBinary(int decimal) 
    {
        if (decimal == 0) 
        {
            return "0";
        } 
        else if (decimal == 1) 
        {
            return "1";
        }
        else 
        {
            return decimalToBinary(decimal / 2) + decimal % 2;
        }
    }

    public static int multiply(int a, int b) 
    {
        if (b == 0) 
        {
            return 0;
        } 
        else 
        {
            return a + multiply(a, b - 1);
        }
    }
}
