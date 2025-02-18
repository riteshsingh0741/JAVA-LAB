package lab1;

import java.util.Scanner;

public class SimpleSumDigitCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum is: " + sum);

        // Check if the sum is prime
        boolean isPrime = true;
        if (sum <= 1) isPrime = false;
        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Prime: " + (isPrime ? "Y" : "N"));

        // Check if the sum is an Armstrong number
        int armstrongSum = 0, tempSum = sum;
        int digits = String.valueOf(sum).length();
        while (tempSum > 0) {
            armstrongSum += Math.pow(tempSum % 10, digits);
            tempSum /= 10;
        }
        System.out.println("Armstrong: " + (armstrongSum == sum ? "Y" : "N"));

        // Check if the sum is a perfect number
        int perfectSum = 0;
        for (int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                perfectSum += i;
            }
        }
        System.out.println("Perfect: " + (perfectSum == sum ? "Y" : "N"));

        scanner.close();
    }
}

