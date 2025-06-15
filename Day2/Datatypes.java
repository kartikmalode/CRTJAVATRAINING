package Day2;
import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class Datatypes {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    //   System.out.println("enter a byte value");
    //   byte bytval = sc.nextByte();

    //   System.out.println("enter a short val");
    //   short sh = sc.nextShort();

    //   System.out.println("enter long");
    //   long lng  = sc.nextLong();

    //   System.out.println("enter string");
    //   sc.nextLine();
    //   String str = sc.nextLine();


    //   System.out.println("enter char");
    //   char ch = sc.next().charAt(0);

    //   System.out.println("enter boolean");
    //   boolean b = sc.nextBoolean();
  
    //   System.out.println(bytval);
    //   System.out.println(sh);
    //   System.out.println(lng);
    //   System.out.println(str);
    //   System.out.println(ch);
    //   System.out.println(b);

      System.out.println("convert int to byte");
     int n = sc.nextInt();
     byte bt = (byte) n;
     System.out.println(n + " byte is "+bt);
    }
}
