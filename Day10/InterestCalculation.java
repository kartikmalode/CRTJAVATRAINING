package Day10;
// Bank Account Model: Interest Calculation
// Problem Statement:
//  Implement a BankAccount-SavingsAccount inheritance model where savings accounts earn interest.
// BankAccount base class: accountNumber, holderName, balance.
// SavingsAccount subclass: interestRate.
// Method calculateCompoundInterest(years) should compute future balance using:
// balance * (1 + interestRate/100)^years
// Use constructor chaining in initialization.
// Sample Input:
// SavingsAccount savings = new SavingsAccount(56789, "Priya Sharma", 50000, 5);
// savings.calculateCompoundInterest(2);

// Expected Output:
// Account Holder: Priya Sharma
// Account Number: 56789
// Initial Balance: ₹50000
// Interest Rate: 5%
// Balance after 2 years: ₹55125

// BankAccount.java
class BankAccount {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
}

// SavingsAccount.java
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance); // Constructor chaining
        this.interestRate = interestRate;
    }

    public void calculateCompoundInterest(int years) {
        double finalBalance = balance * Math.pow((1 + interestRate / 100), years);

        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Initial Balance: ₹%.0f\n", balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.printf("Balance after %d years: ₹%.0f\n", years, finalBalance);
    }
}

// Main.java
public class InterestCalculation {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(56789, "Priya Sharma", 50000, 5);
        savings.calculateCompoundInterest(2);
    }
}
