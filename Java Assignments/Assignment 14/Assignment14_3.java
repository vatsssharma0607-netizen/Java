import java.util.*;
public class Assignment14_3 
{
    public static void main(String[] args) 
    {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        System.out.println("Cities in the list: " + cities);
        cities.add(1, "Phoenix");
        System.out.println("Cities in the list after adding Phoenix: " + cities);
        cities.remove(3);
        System.out.println("Cities in the list after removing Houston: " + cities);
        Collections.sort(cities);
        System.out.println("Cities in the list after sorting: " + cities);
        Collections.reverse(cities);
        System.out.println("Cities in the list after reversing: " + cities);
        System.out.println("Using for each loop:");
        for (String city : cities) 
        {
            System.out.println(city);
        }
        cities.clear();
        System.out.println("Is empty? " + cities.isEmpty());
    }
}
