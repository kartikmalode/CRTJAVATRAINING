package Day8;

import java.util.Scanner;

public class Account {
    //creating an array refernce
    private int accid;
    private String name;
    private double balance;

    public Account(int id, String n,double bal){
        accid=id;
        name = n;
        balance= bal;
    }
    public void show(){
        System.out.println("name is "+name+"\n id is "+accid+"\n balance is "+balance);
    }
     
    
    public static void main(String args[]) {
        Account []A = new Account[2];
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double balnace;
        for(int i=0; i<A.length; i++){
            System.out.println("Enter Id ,name and balance for account "+(i+1));
            id = sc.nextInt();
            sc.nextLine();
            name = sc.nextLine();
            balnace = sc.nextDouble();
            A[i] = new Account(id, name, balnace);
        }
        for(Account X:A){
            X.show();
        }
    }
}

