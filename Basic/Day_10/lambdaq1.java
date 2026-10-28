package Basic.Day_10;
import java.util.Scanner;
    interface Square {
    int calculate(int n);
}
public class lambdaq1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Square s = n -> n * n;

        System.out.println("Square = " + s.calculate(num));

        sc.close();
    }
}
    
