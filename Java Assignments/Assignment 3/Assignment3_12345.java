class Assignment3_12345 
{
    public static boolean checkPassword(String password) 
    {  
        String setPassword = "password123"; 
        return password.equals(setPassword);
    }
    public static String reverseString(String str) 
    {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String str) 
    {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }
    public static int countVowels(String str) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                count++;
            }
        }
        return count;
    }
    public static int countCharacters(String str) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (Character.isLetterOrDigit(str.charAt(i))) 
            {
                count++;
            }
        }   
        return count;
    }
    public static void main(String[] args) 
    {
        String password = "password123";
        String testString = "racecar";  
        System.out.println("Password check: " + checkPassword(password));
        System.out.println("Reversed string: " + reverseString(password));
        System.out.println("Is palindrome: " + isPalindrome(password));    
        System.out.println("Number of vowels: " + countVowels(password));
        System.out.println("Number of characters: " + countCharacters(password));
    }
}
