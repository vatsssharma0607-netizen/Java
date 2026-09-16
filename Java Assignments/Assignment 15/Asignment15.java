import java.util.*;
public class Asignment15 
{
    public static void main(String[] args) 
    {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple"); 
        System.out.println("Fruits in the set: ");
        System.out.println(fruits);
        System.out.println("Size of the set: " + fruits.size());
        System.out.println("Does the set contain 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Does the set contain 'Pineapple'? " + fruits.contains("Pineapple"));
        System.out.println("Is the set empty? " + fruits.isEmpty());
        fruits.remove("Banana");
        System.out.println("Fruits in the set after removing 'Banana': ");
        System.out.println(fruits);
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Papaya");
        moreFruits.add("Kiwi");
        moreFruits.add("Mango");
        fruits.addAll(moreFruits);
        System.out.println("Fruits in the set after adding more fruits: ");
        System.out.println(fruits);
        fruits.removeAll(moreFruits);
        System.out.println("Fruits in the set after removing more fruits: ");
        System.out.println(fruits);
        Set<String> commonFruits = new HashSet<>(fruits);
        commonFruits.retainAll(moreFruits);
        System.out.println("Common fruits: " + commonFruits);
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
        System.out.println("Using for each loop:");
        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }
        Object[] fruitsArray = fruits.toArray();
        System.out.println("Fruits in the array: "); 
        for(Object obj : fruitsArray) 
        {
            System.out.println(obj);
        }
        System.out.println("Hash code of the set: " + fruits.hashCode());
        Set<String> Fruits = new HashSet<>();
        Fruits.addAll(fruits);
        System.out.println("Fruits in the new set: " + fruits.equals(Fruits));
        fruits.clear();
        System.out.println("Fruits in the set after clearing: " + fruits);
        System.out.println("Is the set empty after clearing? " + fruits.isEmpty());     
    }
}
