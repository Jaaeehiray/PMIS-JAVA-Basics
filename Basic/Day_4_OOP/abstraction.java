package Basic.Day_4_OOP;

// Abstract Parent Class
abstract class PaymentGateway {

    // Concrete method (shared behavior)
    void printReceipt() {
        System.out.println("Receipt generated.");
    }

    // Abstract method: child class MUST implement this
    abstract void processPayment(double amount);
}


// Concrete Child Class 1
class UPIPayment extends PaymentGateway {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI QR code.");
    }
}


// Concrete Child Class 2
class CreditCardPayment extends PaymentGateway {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Card Swipe and OTP.");
    }
}


// Main Class
public class abstraction {

    public static void main(String[] args) {

        // Cannot create object of abstract class
        // PaymentGateway p = new PaymentGateway();

        // Parent reference pointing to child object
        PaymentGateway payment = new UPIPayment();

        // Calls UPIPayment's implementation
        payment.processPayment(250.0);

        // Calls concrete method from parent class
        payment.printReceipt();
    
    PaymentGateway CreditCardPayment = new CreditCardPayment();
    CreditCardPayment.processPayment(500.0);
    CreditCardPayment.printReceipt();

    }
}
