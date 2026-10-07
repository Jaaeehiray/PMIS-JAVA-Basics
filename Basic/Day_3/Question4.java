//Write a function which takes in 2 numbers and returns the greater of those two. 

package Basic.Day_3;

import java.util.Scanner;

public class Question4 {
     // Function to find the greater number
    static int greater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = greater(num1, num2);

        System.out.println("Greater number is: " + result);

        sc.close();
    }
}

    

