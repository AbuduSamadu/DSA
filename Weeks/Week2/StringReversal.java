package Weeks.Week2;

public class StringReversal {

    public static String reverseSubstring(String str, int start, int end) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Reverse characters between start and end
        while (start < end) {
            // Swap characters at indexes 'start' and 'end'
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move pointers towards each other
            start++;
            end--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "ooneefspd";

        // Reverse characters from index 1 to index 3
        int start = 0;
        int end = 8;

        String result = reverseSubstring(input, start, end);

        // Print the modified string
        System.out.println(result);
    }
}
