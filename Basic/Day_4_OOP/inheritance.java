package Basic.Day_4_OOP;
class Vehicle {
    String brand;
    
    void startengine() {
        System.out.println("Engine started for " + brand);
    }
}

class Bike extends Vehicle{
    boolean hasCarrier;
    void KickStart() {
        System.out.println("Kickstand put down.");
}
}

public class inheritance {
    public static void main(String[] args){
        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.startengine(); 
        myBike.KickStart();
    
    }
}
