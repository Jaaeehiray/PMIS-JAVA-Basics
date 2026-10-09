package Basic.Day5;

/*class Emplyee{
    double salary = 30000;
}

class manger extends Emplyee{
    double salary = 60000;

    void displaysalary(){
        System.out.println("Manger salary:" + salary);
        System.out.println("employee salary: " + super.salary);
    }
}
*/

/*class Animal{
    void eat(){
        System.out.println(" Animal is eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
        super.eat();
}
}
*/

/*class BankAccount {
    String accountHolder;

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 4.5;

    SavingsAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
*/

/*class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
*/

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}

