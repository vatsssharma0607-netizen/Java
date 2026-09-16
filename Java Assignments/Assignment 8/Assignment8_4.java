public class Assignment8_4 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30};
        try 
        {
            int value = numbers[5]; 
            int result = value / 0; 
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Invalid array index.");
        }
    }
}