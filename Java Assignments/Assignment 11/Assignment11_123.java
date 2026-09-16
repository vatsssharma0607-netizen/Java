interface Greeting
{
    void sayHello();
}
interface Square
{
    int square(int n);
}
interface Addition
{
    int add(int a, int b);
}
public class Assignment11_123 
{
    public static void main(String[] args) 
    {
        Greeting greeting = () -> System.out.println("Hello, World!");
        greeting.sayHello();

        Square square = (n) -> n * n;
        System.out.println("Square of 5: " + square.square(5));

        Addition addition = (a, b) -> a + b;
        System.out.println("Sum of 3 and 4: " + addition.add(3, 4));
    }   
}
