public class Assignment1_5 
{
    public static void reverseAndSum(int number) 
    {
        int reversedNumber = 0;
        int sumOfDigits = 0;
        int originalNumber = number;
        while (number != 0) 
        {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            sumOfDigits += digit; 
            number /= 10; 
        }
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Digits: " + sumOfDigits);
    }
    public static void main(String[] args) 
    {
        int number = 12345; // Example number
        reverseAndSum(number);
    }
}
