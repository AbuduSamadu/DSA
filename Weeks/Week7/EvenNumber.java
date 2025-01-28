package Weeks.Week7;

import java.util.List;

public class EvenNumber <T> {
    private T data;

    public EvenNumber(T data){
        this.data = data;
    }

    public static void main(String[] args){
        List<Integer> evenNum = List.of(1,2,3,4,5,6,7,8,9,10);
        evenNum.stream()
                .filter(n-> n%2 == 0)
                .forEach(System.out::println);
    }
}
