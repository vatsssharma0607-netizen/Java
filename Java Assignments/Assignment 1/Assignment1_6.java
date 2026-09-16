public class Assignment1_6 
{
    public static void main(String[] args)
    {
        int start = 1; 
        int end = 10;  
        int sum = 0;   
        for (int i = start; i <= end; i++) 
        {
            sum += i; 
        }
        System.out.println("The sum of numbers between " + start + " and " + end + " is: " + sum);
    }
    public static int sumOfNumbers(int start, int end) 
    {
        int sum = 0; 
        for (int i = start; i <= end; i++) 
        {
            sum += i; 
        }
        return sum;
    }
}