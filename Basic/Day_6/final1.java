package Basic.Day_6;

public class final1{
    final void calculateIntrest(){
        System.out.println("base intrest caculation");
    }
    
}

class Branch extends final1{
    void calculateIntrest(){
        System.out.println("custom Intrest");
    }
}
