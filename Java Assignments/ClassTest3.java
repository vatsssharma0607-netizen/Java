import java.util.*;
public class ClassTest3 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        System.out.println("\nEven Numbers:");
        list.forEach(n -> {
            if(n%2==0){System.out.println(n);}});
    }
}