package Basic.Day_4_OOP;
class Car{
    String color;
    String Brand;
    int speed;

    Car(String color, String Brand, int speed){
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }
    void display(){
        System.out.println(Brand + "\n"+ color +"\n"+speed);
    }

    void accelerate(int incr){
        int or_speed = speed;
        speed += incr;
        System.out.println("Original speed: " + or_speed);
        System.out.println(Brand + " accelerated by " + incr + " km/h. New speed: " + speed);
    }

public class test2 {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota", 200 );
        car1.display();
        car1.accelerate(50);
       
    }
}
}