public class Assignment3_2 
{
    public static void main(String[] args) 
    {
        String text = "Hello World";
        int index = 4;       
        char newChar = 'a';   
        if (index < 0 || index >= text.length()) 
        {
            System.out.println("Invalid index!");
        } 
        else 
        {
            String updatedText = text.substring(0, index) + newChar + text.substring(index + 1);
            System.out.println("Original String: " + text);
            System.out.println("Updated String:  " + updatedText); 
        }
    }
}

