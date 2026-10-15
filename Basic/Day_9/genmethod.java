package Basic.Day_9;

class Util{
    static <T> void printwice(T value){
        System.out.println(value);
        System.out.println(value);
    }
    static <T> T firstOf(T a, T b){
        return b;
    }
}

public class genmethod {
    public static void main(String[] args) {
        Util.printwice(100);
        System.out.println(Util.firstOf("hii","Hello"));

    }
    
}
