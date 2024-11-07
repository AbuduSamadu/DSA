
public class LengthOfLastElement {

    public static void main(String[] args) {
        String s = "Hello World";
        String[] words = s.split(" ");
        System.out.println(words[words.length - 1].length());
    }
}
