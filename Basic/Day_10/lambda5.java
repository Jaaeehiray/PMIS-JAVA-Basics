package Basic.Day_10;
import java.util.function.*;
import java.util.*;
 class lambda5 {
    public static void main(String[] args) {
        Supplier<String> otpGen = () ->{
            Random random = new Random();
            int number = 100000 + random.nextInt(90000000);
            return String.valueOf(number);
        };
        String userOtp =otpGen.get();
        System.out.println("The OTP is: " + userOtp);
    }
    
}
