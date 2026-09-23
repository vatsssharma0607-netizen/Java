import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Charlie");
        students.add("Alice");
        students.add("Bob");
        students.add("David");
        Collections.sort(students, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted Student Names: " + students);
    }
}