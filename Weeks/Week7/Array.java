package Weeks.Week7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bobs", "Abudu", "Cindy", "Yaw");

        names.stream()
                .filter(n-> n.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
