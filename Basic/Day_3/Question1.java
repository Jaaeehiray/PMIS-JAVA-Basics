package Basic.Day_3;

import java.util.*;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 =sc.nextInt();
        
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
    
}