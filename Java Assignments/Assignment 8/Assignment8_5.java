public class Assignment8_5
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20};
        try 
        {
            try 
            {
                int result = arr[0] / 0; 
            } 
            catch (ArithmeticException e) 
            {
                System.out.println("Inner Catch: Divided by zero.");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Outer Catch: Invalid array index.");
        }
    }
}