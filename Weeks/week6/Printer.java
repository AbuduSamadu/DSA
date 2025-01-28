package Weeks.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Printer <T> {
    private final T integer;

    public Printer(T integer){
        this.integer = integer;
    }

    public void print(){
        System.out.println(integer);
    }

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(5);
       integerPrinter.print();


       Printer<String> stringPrinter = new Printer<>("Hello");
       stringPrinter.print();

        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            myList.add(i);
        }

        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); // filter numbers greater than 90
        highNums.forEach(p -> System.out.print(p + " "));

        }

        Stream<String> names = Stream.of("aBc", "d", "ef");





   }

