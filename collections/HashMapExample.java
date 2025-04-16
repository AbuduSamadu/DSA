package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String>  students = new HashMap<>();
        students.put(34, "Kofi");
        students.put(12, "Yaw");

        System.out.println(students.get(12));

        for (Map.Entry<Integer, String > student  : students.entrySet()){
            System.out.println(student.getValue());
        }
    }
}
