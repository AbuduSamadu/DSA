
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dog {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("dog|cat");
        Matcher matcher = pattern.matcher("The dog and cat are friends.");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
