package Basic.Day_3;

import java.util.Scanner;

public class Question8 {
    // Function to calculate x raised to the power n
    static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println(x + " raised to the power " + n + " = " + result);

        sc.close();
    }
    
}
