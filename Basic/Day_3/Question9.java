//Write a function that calculates the Greatest Common Divisor of 2 numbers.

package Basic.Day_3;

import java.util.Scanner;

public class Question9 {
    // Function to calculate GCD
    static int findGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        sc.close();
    }
}

