package Weeks.week6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;


public class Lambda {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
       out.println(names.map(String::toUpperCase).toList());
    }

    Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");

    List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).toList();

    Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");

    List<String> naturalSorted = names3.sorted().toList();
    // [ef, d, 123456, aBc]
}
