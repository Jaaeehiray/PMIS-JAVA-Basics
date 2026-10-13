package Basic.Day_7.Array;
import java.util.Scanner;
public class sec_largest_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least 2 elements");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        boolean foundSecond = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                foundSecond = true;
            } else if (arr[i] < largest &&
                       (!foundSecond || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                foundSecond = true;
            }
        }

        if (foundSecond && secondLargest < largest) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest distinct element found");
        }

        sc.close();
    }

    
}
