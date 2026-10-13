package Basic.Day_7;
//String sum
public class interface_wraper {
    public static void main(String[] args) {
        String input = "10,25,40,15,60";
        String[] parts = input.split(",");
        int total = 0;

        for (String part : parts){
            total += Integer.parseInt(part);
        }
        System.out.println("Total sum: "+ total);

    }
}
