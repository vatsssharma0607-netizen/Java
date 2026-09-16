import java.util.function.*;
@FunctionalInterface
interface Greeting
{
    void sayHello();
}
public class Assignment12 
{
    public static void main(String[] args) 
    {
        Greeting greeting = () -> System.out.println("Hello, World!");
        greeting.sayHello();

        Consumer<String> c=name -> System.out.println("Consumer: " + name + "!");
        c.accept("Viking");

        Predicate<Integer> p = n -> n > 18;
        System.out.println("Predicate: " + p.test(20));

        Function<Integer, Integer> f = n -> n * n;
        System.out.println("Function: " + f.apply(8));

        Supplier<String> s = () -> "Java Programming";
        System.out.println("Supplier: " + s.get());
    }   
}
