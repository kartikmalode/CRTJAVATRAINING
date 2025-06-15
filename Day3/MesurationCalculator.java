package Day3;

import java.util.Scanner;

public class MesurationCalculator {
    public static void main(String[] args) {

        double a;
        double l,b;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter choice ");
     int choice = sc.nextInt();

     switch (choice) {
        case 1: System.out.println("Sqare "+Math.pow(a, 2)); 
            break;
            case 2: System.out.println("rectangle "+l*b);
     
        default:
            break;
     }
    }
}
