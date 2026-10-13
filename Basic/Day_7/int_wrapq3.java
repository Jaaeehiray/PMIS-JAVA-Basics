package Basic.Day_7;
import java.util.ArrayList;
import java.util.List;
//Filter Evens
public class int_wrapq3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(7);
        numbers.add(23);
        numbers.add(44);
        numbers.add(91);
        numbers.add(50);

        List<Integer> evens = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        System.out.println("Even numbers: " + evens);
    }
}

