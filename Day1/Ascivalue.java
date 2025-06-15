package Day1;
import java.util.*;
public class Ascivalue {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    char ch = sc.next().charAt(0);
    //    sc.close();
      
    //    int asci = (int) ch;
    //    System.out.println("Asci value of "+ch+ " is "+asci);
       
       int s = sc.nextInt();

       char ch = (char) s;
       System.out.println(" "+s+ " is "+ ch);
       
    }
}
