import java.util.Scanner;
class AuthenticationException extends Exception
{
    public AuthenticationException(String message)
    {
        super(message);
    }
}
public class Assignment9 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try
        {
            if(username.equals("Viking") && password.equals("123456789"))
            {
                System.out.println("Authentication successful!");
            }
            else
            {
                throw new AuthenticationException("Invalid username or password.");
            }
        }
        catch(AuthenticationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
