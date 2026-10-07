//write code to take two numbers from user and print their sum as a floating point number.

/*package Basic;
import java.util.*;
public class todoq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        float num1 = sc.nextFloat();
        System.out.println("Enter num 2");
        float num2 = sc.nextFloat();
        System.out.println("Sum: " + (num1 + num2));
    }
}*/

/*package Basic;
import java.util.*;
public class todoq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = sc.nextInt ();
        int celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}*/

//User inputs month number and program Print the name of the month , using switch case statement.
/*package Basic;
import java.util.*;
public class todoq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month number: ");
        int a = sc.nextInt(); //switch (sc.nextInt());
        switch (a) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number.");
        }
    }
}*/

// Calculetor
//swap the values of two nummber without using third variable
/*package Basic;
import java.util.Scanner;
class todoq { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }


}*/
/*package Basic;
import java.util.Scanner;
class todoq { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + remainingSeconds + " seconds");
    }
}
*/

/*package Basic;
import java.util.Scanner;
class todoq { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3) {
            System.out.println("Largest number is: " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("Largest number is: " + num2);
        } else {
            System.out.println("Largest number is: " + num3);
        }
    }
}
*/
package Basic;
import java.util.Scanner;
class todoq { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}