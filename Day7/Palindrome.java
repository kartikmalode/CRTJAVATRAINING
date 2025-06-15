package Day7;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
       int rev = 0,temp =num;
        while (temp>0) {
             rev =rev*10+temp%10;
             temp = temp/10; 
        }
        if (num ==rev) {
            System.out.println("palindrome");
        }else{
           System.out.println(" nota palindrome");

        }
    }
}
