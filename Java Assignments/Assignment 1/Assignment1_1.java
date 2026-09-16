import java.util.Scanner;
class Assignment1_1
{
    public static void addnumbers(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
    public static void addnumbers()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=s.nextInt();
        System.out.println("Enter second number: ");
        int b=s.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is: " + (a+b));
    }
        public static void main(String[] args)
    {
        addnumbers(5, 10);
        addnumbers();
    }
}