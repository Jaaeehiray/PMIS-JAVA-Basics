//wildcard
package Basic.Day_9;
import java.util.*;
public class wildcard {
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.println(o);

        }
    }
    public static void main(String[] args) {
        List<String> name = Arrays.asList("A","b","c");
        List<Integer> nums = Arrays.asList(100, 52, 63);
        List<Double> prices = Arrays.asList(99.2,52.1,65.3);
        
        System.out.println("name");
        printList(name);

        System.out.println("\nNumbers");
        printList(nums);

        System.out.println("\nprices");
        printList(prices);
    }
}
