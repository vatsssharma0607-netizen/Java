public class Assignment8_3
{
    public static Integer convertStringToInt(String input) 
    {
        try 
        {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + input + "\" is not a valid integer. (" + e.getMessage() + ")");
            return null;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Result: " + convertStringToInt("42"));
        System.out.println("Result: " + convertStringToInt("-100"));
        System.out.println("Result: " + convertStringToInt("abc"));
        System.out.println("Result: " + convertStringToInt("12.34"));
        System.out.println("Result: " + convertStringToInt(""));
    }
}