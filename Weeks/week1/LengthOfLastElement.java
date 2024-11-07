
public class LengthOfLastElement {

    public static void main(String[] args) {
        String s = "Hello World";
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        System.out.println("Length of the last non-empty word: " + length);
    }
}