import java.util.*;
public class Assignment14_1 
{
    public static void main(String[] args) 
    {
       List<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Cherry");
       fruits.add("Date");
       System.out.println("Fruits in the list: " + fruits);
       fruits.add(2, "Blueberry");    
       System.out.println("Fruits in the list after adding Blueberry: " + fruits);  
       System.out.println("First Element: " + fruits.get(0));
       fruits.set(1, "Kiwi");
       System.out.println("Fruits in the list after replacing Banana with Kiwi: " + fruits);
       fruits.remove("Orange");
       System.out.println("Fruits in the list after trying to remove Orange: " + fruits);
       System.out.println("Contains Mango? " + fruits.contains("Mango"));
       System.out.println("Using for each loop:");  
       for (String fruit : fruits) 
        {
           System.out.println(fruit);
        }
        fruits.clear();
        System.out.println("Fruits in the list after clearing: " + fruits); 
    }
}