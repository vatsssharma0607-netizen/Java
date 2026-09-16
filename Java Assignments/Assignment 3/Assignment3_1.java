import java.util.Scanner;
public class Assignment3_1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int length = text.length();
        if (length % 2 == 0) 
        {
            System.out.println("The length of '" + text + "' is " + length + ", which is EVEN.");
        } else 
        {
            System.out.println("The length of '" + text + "' is " + length + ", which is ODD.");
        }
        scanner.close();
    }
}
