package Basic.Day_6;

// class Engine{
//     void start(){
//         System.out.println("Engine is Starting");

//     }
// }

// class car{
//     private Engine engine;
//     car(){
//         this.engine = new Engine();
//     }
//     void drive(){
//         engine.start();
//         System.out.println("Car is Moving");
//     }
// }

class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode){
    this.city = city;
    this.state = state;
    this.pincode = pincode;

}
void displayAddress(){
    System.out.println(city + ", "+ state + ", " + pincode);
}
}
class student{
    String name;
    int rollnumber;
    Address address;

    student(String name, int rollnumber, Address address){
        this.name = name;
        this.rollnumber = rollnumber;
        this.address = address;

    }

    void displayprofile(){
        System.out.println("student: " + name + "\nroll no. "+ rollnumber);
        System.out.println("Lives at:");
        address.displayAddress();
    }
}

