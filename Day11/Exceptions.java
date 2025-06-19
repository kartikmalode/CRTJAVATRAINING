package Day11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
           int  x = sc.nextInt();
           int  y= sc.nextInt();
        //    InputMismatchException ie = new InputMismatchException();
        //    throw ie;
           if (x<=0) {
            ArithmeticException obj = new ArithmeticException();
            throw obj;
           }
            int c = x/y;
            System.out.println(c);
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }

        finally{
            System.out.println("welcome to finally");
        }
    }
}
