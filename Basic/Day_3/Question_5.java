//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. 

package Basic.Day_3;

import java.util.Scanner;

public class Question_5 {

    // Function to check voting eligibility
    static boolean isEligible(int age) {
        return age > 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (isEligible(age)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
    

