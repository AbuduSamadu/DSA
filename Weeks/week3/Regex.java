package Weeks.week3;

import java.util.regex.*;



public class Regex {

  public static void main(String[] args) {

    Pattern pattern = Pattern.compile(".*kwame*.");
    Matcher matcher = pattern.matcher("kwame is the best");

    boolean isMatch = matcher.find();
    if (isMatch) {
      System.out.println("Match found");
      System.out.println(matcher.group());
    } else {
      System.out.println("No match found");
    }


       
  }  
}
