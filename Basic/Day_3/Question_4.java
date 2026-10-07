// Write a function that takes in the radius as input and returns the circumference of a circle.
package Basic.Day_3;
import java.util.*;
public class Question_4 {
     // Function to calculate circumference
    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double result = circumference(radius);

        System.out.println("Circumference of the circle: " + result);

        sc.close();
    }
}