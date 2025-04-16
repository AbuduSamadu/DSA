package collections;

import java.util.*;

public class StudentManager {

    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Kwame");
        studentNames.add("Bob");
        studentNames.add("Kofi");
        studentNames.add("Yaw");
        studentNames.add("Kwame");

        System.out.println("Original list: " + studentNames);

        Set<String> uniqueNames = new HashSet<>(studentNames);
        System.out.println("Unique Names: " + uniqueNames);

        Set<String> sortedNames = new TreeSet<>(uniqueNames);
        System.out.println("Sorted names: " + sortedNames);

        for(String name: studentNames){
            name.toLowerCase();
        }
        sortedNames.stream()
                .filter(n->n.startsWith("K"))
                .forEach(System.out::println);

    }
}
