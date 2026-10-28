package Basic.Day_10;
import java.util.List;
import java.util.stream.Collectors;
public class stream4 {
    public static void main(String[] args) {
        List<Integer> nums =List.of(5,12,8,3,4,6);
        List<Integer> res = nums.stream()
        .map(n -> n *2)//intermediate operation
        .collect(Collectors.toList());
        System.out.println(res);
    }
    
}
