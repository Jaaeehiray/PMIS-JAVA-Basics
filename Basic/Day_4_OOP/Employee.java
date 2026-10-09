package Basic.Day_4_OOP;

class person{
    private int ID;
    private String name;
    private double salary;

   public person(int ID, String name, double salary){
    this.ID = ID;
    this.name = name;
    if(salary >= 0){
       this.salary = salary;
    }
    else{
        salary = 0.0;
    }
   }
    //Getters
    public int getID() {
        return ID;
    }

    public String getname(){
        return name;
    }
     
    public double getsalary(){
        return salary;
    }

    // setter with validation
    public void setSalary(double salary){
        if(salary >= 0) {
            this.salary = salary;
   } else{
    System.out.println("Error: Salary cannot be negative:");
   }
}
// business logic method
public void giveRaise(double percent){
    if (percent > 0) {
        double raiseAmmount = this.salary* (percent / 100.0);
        this.salary += raiseAmmount;
        System.out.println(name +  "received a"  + percent +  "% raise.New Salary: $" + this.salary);
    }else{
        System.out.println("Raise percentage must be positive.");
    }
}
}
public class Employee {
    public static void main(String[] args){
    person emp = new person(101, "Jaee", 5000.0);
    System.out.println("Initial Salary: $" + emp.getsalary());

    //Apply raise
    emp.giveRaise(8);

    //Attemp invalide update
    emp.setSalary(-25000);//Triggers validation error

    //final check
    System.out.println("Final Verifide salary: $" + emp.getsalary());
}
}
