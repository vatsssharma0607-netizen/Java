import java.util.*;
public class Assignment14_2 
{    
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        System.out.println("Numbers in the list: " + numbers);
        numbers.add(2, 10);
        numbers.remove(3);
        numbers.set(1, 7);
        Collections.sort(numbers);
        System.out.println("Highest number in the list: " + Collections.max(numbers));
        System.out.println("Lowest number in the list: " + Collections.min(numbers));
        Collections.reverse(numbers);
        System.out.println("Numbers in the list after reversing: " + numbers);
        System.out.println("Using for each loop:");
        for (int i=0; i < numbers.size(); i++) 
        {
            System.out.println(numbers.get(i));
        }
        numbers.clear();
        System.out.println("Is empty? " + numbers.isEmpty());
    }
}