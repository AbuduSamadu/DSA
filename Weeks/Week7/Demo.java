package Weeks.Week7;

import java.util.List;

public class Demo {
    public static void main(String[] args){
        List<Integer> names = List.of(12,4,5,8,9,11,12);

        List<String> colors = List.of("red", "yellow", "blue", "brown","black","indigo");
        displayList(colors);
        displayList(names);

    }

    private static void displayList(List<?> list) {
        list.forEach(System.out::println);
        System.out.println();

    }
}
