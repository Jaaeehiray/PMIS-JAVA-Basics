package Basic.Day_4_OOP;
class Test{ 
    String accountHolder; 
    double balance;

   Test(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance:" + balance);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance:" + balance);
        } else {
            System.out.println("Insufficient balance. Current Balance: " + balance);
        }
    }

    void display(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args){
        Test act1 = new Test ("Jaaee", 1000.0);
        act1.display();
        act1.deposit(500.0);
        act1.withdraw(200.0);

        Test act2 = new Test ("Mayuri", 1500.0);
        act2.display();
        act2.deposit(300.0);
        act2.withdraw(100.0);
    }
    
}
