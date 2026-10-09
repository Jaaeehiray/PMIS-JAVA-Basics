package Basic.Day5;

//Simple inheritance 
/*class Animal{
    void eat(){
        System.out.println("This animal eats food.");

    }
}
    class Dog extends Animal{
        void bark(){
            System.out.println("The dog barks:");

        }
    }

public class inheritance {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
    
}
*/

//Multi-level Inheritance
//parent class
/*class Device{
    void poweron(){
        System.out.println("divece power on.");
    }

}

//child class
class dabbaphone extends Device{

    void makeCall(){
        System.out.println("calling the number.....");

    }
}

class smartphone extends dabbaphone{

    void browseInternet(){
        System.out.println("Opening Browser...");
    }
}

public class inheritance{
    public static void main(String[]args)
{
    smartphone samsung = new smartphone();
    samsung.browseInternet();
    samsung.makeCall();
    samsung.poweron();
}
}
*/

//Hierarchical Inheritance

//common parent

/*class shape{
    String color = "Blue";
}

class circle extends shape{
    void drawcircle(){
        System.out.println("drawing a "+color+" circle");
    }
}

class Rectangle extends shape{
    void drawRectangle(){
   System.out.println("drawing a "+color+" Rectangle.");
}
}

public class inheritance{
    public static void main(String[] args){
        circle c = new circle();
        Rectangle r = new Rectangle();
        c.drawcircle();
        r.drawRectangle();
    }
}
*/

//Multiple inheritance

interface Mother{
    void message();
 }

 interface Father{
    void message();
 }
 class child implements Mother, Father{
    @Override 
    public void message(){
        System.out.println("Loving both mom and dad:");
    }
 }

 public class inheritance{
    public static void main(String[] args){
    child c = new child();
    c.message();

    Mother m = new child();
    m.message();

    Father f = new child();
    f.message();
 }
}



