package Day3;
import java.util.Scanner;

public class PR3 {
 public static void main(String[] args) {
    //convert temprature from fahrenheit to celsius degree
    Scanner sc = new Scanner(System.in);
    double F = sc.nextDouble();
    double c = (5*(F-32))/9;

       F = (9*c+(32*5))/5;

       System.out.println(c);
       System.out.println(F);

 }   
}
