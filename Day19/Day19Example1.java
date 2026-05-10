
// Least Privilege Principle Example

class BankAccount {

    // private field
    private double balance;

    // public method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // public method to view balance
    public double getBalance() {
        return balance;
    }
}

public class Day19Example1 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.deposit(1000);

        System.out.println("Balance: " + b1.getBalance());
    }
}
