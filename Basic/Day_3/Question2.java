// Write a function to print the sum of all odd numbers from 1 to n.

package Basic.Day_3;

public class Question2 {
    public static void printSumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }
    public static void main(String[] args) {
        int n = 5; // You can change this value to test with different numbers
        printSumOfOdds(n);
}
}
