public class PROG_10 
{
    public static void main(String[] args) 
    {
        String s = "pots&pans";
        System.out.println("Original string: " + s);
        String reversed = reverseString(s);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String s) 
    {
        if (s.length() <= 1) 
        {
            return s;
        } 
        else 
        {
            char firstChar = s.charAt(0);
            String remainingString = s.substring(1);
            return reverseString(remainingString) + firstChar;
        }
    }
}
