package Basic.Day_4_OOP;
class COffeWallet{
    String Customer_Name;
    double balance;

    COffeWallet(String Customer_Name, double balance){
        this.Customer_Name = Customer_Name;
        this.balance = balance;
    }
    void addBalence(double amount){
        balance += amount;
        System.out.println("Amount added: " + amount);
        System.out.println("New balance: " + balance);
    }
    void purches(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("succesfully Purches");
            System.out.println("balence after purches: " + balance);
        }
        else{
            System.out.println("Insufficient balance for the purchase.");
        }
    }
        void showsDitailes(){
            System.out.println("Customer Name: " + Customer_Name);
            System.out.println("Current Balance: " + balance);
        }
    }


public class constructor {
    public static void main(String[] args) {
        COffeWallet mywallet = new COffeWallet("Ankita",500);
        mywallet.showsDitailes();
        mywallet.addBalence(200);
        mywallet.purches(100);
        
    
}}
