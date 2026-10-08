package Basic.Day_4_OOP;
//compiletime

class calculator {
    int add(int a, int b) {
        return a + b;

    }
    //same name three parameters
    int add( int a, int b, int c) {
        return a + b + c;
    }
// same name, diff type
    double add(double a, double b) {
        return a + b;
    }
}//Runtime polymorphism (Method Overriding)
class Animal{
    void makesound(){
        System.out.println("Animale makes sound");
    
    }
}

class Dog extends Animal{
    @Override 
    void makesound(){
        System.out.println("Dog barks: woof woof");
    }
}
class Cat extends Animal{
    @Override 

    void makesound(){
        System.out.println("Cat meows: meow meow");
    }
}
 public class polymorphism {
    public static void main(String[]args){
        // parent reference pointing to child object
        Animal pet1 = new Dog();
        Animal pet2 = new Cat();
        Animal pet3 = new Animal();

        pet1.makesound();
        pet2.makesound();
        pet3.makesound();


    }
    
}
