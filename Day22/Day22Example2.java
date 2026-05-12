
// Demonstrates Real-world Abstraction Modeling with Payment System

abstract class Payment {

    // Abstract constructor concept
    Payment() {
        System.out.println("Payment system initialized.");
    }

    // Concrete method
    void paymentInfo() {
        System.out.println("Processing secure payment...");
    }

    // Abstract method
    abstract void pay(double amount);
}

// Concrete subclass for Credit Card payment
class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// Concrete subclass for PayPal payment
class PayPalPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class Day22Example2 {

    public static void main(String[] args) {

        Payment credit = new CreditCardPayment();
        credit.paymentInfo();
        credit.pay(5000);

        System.out.println();

        Payment paypal = new PayPalPayment();
        paypal.paymentInfo();
        paypal.pay(3000);
    }
}
