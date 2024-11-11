package Lab.statisticsOfGrade;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradesAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
       
        // Step 1: Input Handling
        System.out.println("Enter student grades separated by spaces (0 - 100):");
        String input = scanner.nextLine();
        String[] inputStrings = input.split(" ");

        int[] scores = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            int grade = Integer.parseInt(inputStrings[i]);
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade encountered: " + grade);
                return;
            }
            scores[i] = grade;
        }

        // Step 2: Calculate Max, Min, and Average
        int max = Arrays.stream(scores).max().orElse(0);
        int min = Arrays.stream(scores).min().orElse(0);
        double avg = Arrays.stream(scores).average().orElse(0.0);

        // Step 3: Generate Stats Array
        int[] stats = new int[5];
        for (int score : scores) {
            if (score > 80) {
                stats[4]++;
            } else if (score >= 61) {
                stats[3]++;
            } else if (score >= 41) {
                stats[2]++;
            } else if (score >= 21) {
                stats[1]++;
            } else {
                stats[0]++;
            }
        }

        // Step 4: Display Results
        System.out.printf("The maximum grade is %d%n", max);
        System.out.printf("The minimum grade is %d%n", min);
        System.out.printf("The average grade is %.6f%n%n", avg);

        // Step 5: Display Graph
        displayGraph(stats);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }

    public static void displayGraph(int[] stats) {
        int maxBars = Arrays.stream(stats).max().orElse(0);

        for (int i = maxBars; i > 0; i--) {
            System.out.print("   " + i + " > ");
            for (int stat : stats) {
                if (stat >= i) {
                    System.out.print(" #######   ");
                } else {
                    System.out.print("           " );
                }
            }
            System.out.println();
        }

        System.out.println("      +-----------+---------+---------+---------+---------+");
        System.out.println("      I    0-20   I  21-40  I  41-60  I  61-80  I  81-100 I");
    }
}
