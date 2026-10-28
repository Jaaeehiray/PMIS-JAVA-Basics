package Basic.Day_10;

//Consumer<T> : T -> "hello, "hi" .accept()
import java.util.function.*;
public class lambda4 {

 public static void main(String[] args) {
    //     Consumer<String> pr = message -> System.out.println(message);

    //     pr.accept("hello i love me");


    // }
    
    Consumer<String> smsNotifier = mobno ->{
        System.out.println("sending the otp to the ph no.: " +mobno);
    };
    smsNotifier.accept("+91 8625845253");
}
}