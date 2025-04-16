package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new TreeMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);
        wordCount.put("pineapple", 1);

        System.out.println(wordCount);

        System.out.println("First key: "+ ((TreeMap<String, Integer>) wordCount).firstKey());
        System.out.println("Last key: "+ ((TreeMap<String, Integer>) wordCount).lastKey());

        for (Map.Entry<String, Integer> word : wordCount.entrySet()){
            System.out.println(" value: " + word.getValue() +","+ "keys: " + word.getKey());
        }

    }
}
