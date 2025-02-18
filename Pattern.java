package lab1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of levels
        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        // Generate the pattern
        for (int i = 1; i <= levels; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


