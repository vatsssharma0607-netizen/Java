public class Assignment1_3 
{
    public static void largestNumber(int a, int b, int c) 
    {
        if (a >= b && a >= c) 
        {
            System.out.println("The largest number is: " + a);
        } 
        else if (b >= a && b >= c) 
        {
            System.out.println("The largest number is: " + b);
        } 
        else 
        {
            System.out.println("The largest number is: " + c);
        }
    }
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        largestNumber(num1, num2, num3);
    }    
}
