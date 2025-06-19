package Day11;

import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try{
        
            int add = a+b;
            System.out.println("addition  is "+add);
            int c= a/b;
            System.out.println("division is "+c);
                
            
        }catch(ArithmeticException e){
          System.out.println("the integer is not divide by zero ");
        }
    }
}
