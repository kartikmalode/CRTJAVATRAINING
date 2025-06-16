package Day8;

import java.util.Scanner;

public class BankAccount {
    private long accountnumber;
    private String holdername;
    private double balance, balancew;
    public BankAccount(long accnum, String hname, double b){
        accountnumber = accnum;
        holdername = hname;
        balance =b;
    }
    public void deposit(double amount){
       balance = amount;
      
    }
    public void withdraw(double amountw){
     balancew = amountw;
    }
    public void displayamount(){
        System.out.println(accountnumber+" "+ holdername);
        System.out.println(balance);
        System.out.println(balancew);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long accountnumber = sc.nextLong();
        String holdername = sc.nextLine();
        double balance = sc.nextDouble();
        sc.close();

        BankAccount b = new BankAccount(accountnumber, holdername, balance);
        b.deposit(42000);
        b.withdraw(400000);
        b.displayamount();
        

    }

}
