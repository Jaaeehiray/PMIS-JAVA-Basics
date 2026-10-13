package Basic.Day_7;
 import java.util.*;

public class Throw {
   public static void main(String[] args){
        System.out.println("enter age:");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age < 0){
            throw new IllegalArgumentException("age Cannot be negative");
        }
        System.out.println("Age:" + age);
    }
}

    



