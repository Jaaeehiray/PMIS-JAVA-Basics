package Basic.Day_7;
import java.util.*;
public class practiceq {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2:");
         int num2 = sc.nextInt();
         try{
            int rest = num1 / num2;
            System.out.println(rest);
        }
        catch(ArithmeticException e){
            System.out.println(" u cannot divide by 0");
        }
        finally{
            System.out.println("program completed");
        }
    }
}

    


    
