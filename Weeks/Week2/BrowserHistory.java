
import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private List<String> history;
    private int currentIndex;
    private int size;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentIndex = 0;
        size = 1;
    }

    public void visit(String url) {
        if (currentIndex < size - 1) {
            history = history.subList(0, currentIndex + 1);
            size = currentIndex + 1;
        }
        history.add(url);
        currentIndex++;
        size++;
    }

    public String back(int steps) {
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }

    public String forward(int steps) {
        currentIndex = Math.min(size - 1, currentIndex + steps);
        return history.get(currentIndex);
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("https://leetcode.com/");
        browser.visit("http://example.com/");
        browser.visit("http://google.com/");
        System.out.println(browser.back(2)); // Output: "https://leetcode.com/"
        System.out.println(browser.forward(1)); // Output: "http://google.com/"
        browser.visit("http://linkedin.com/");
        System.out.println(browser.forward(2)); // Output: "http://linkedin.com/"
        System.out.println(browser.back(2)); // Output: "http://example.com/"

    }
}
