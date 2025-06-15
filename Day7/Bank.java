package Day7;

public class Bank {
    private  String custname;
    private long accnumber;
    private long balance;
    public void setData(){
        custname ="viraj";
        accnumber= 12345678;
        balance = 450000;
    }
    public void showData(){
        System.out.println("custmor name is "+custname+" account number is "+accnumber+" balance is "+balance);
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setData();
        b.showData();

        
    }
}
