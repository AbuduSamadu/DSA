package collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Kwame");
        names.add("Kwaku");
        names.add("Kofi");
        names.add("Ama");
        names.add("Yaw");
        names.add("Kwame");

        System.out.println("Original List: " + names);

        System.out.println("Accessing the forth element in the list: " + names.get(3));

        System.out.println("Modified the last element in the list: " + names.set(5, "Abigail"));

        names.stream()
                .toList()
                .forEach(System.out::println);


    }
}
