package Day9;

import java.util.Scanner;

public class Argument {
    int x;
    int y;
    public void swap(int x, int y){
        int temp = y;
        y = x;
        x = temp;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        
    }
    public void increment(int x,int y){
        x++;
        y++;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                Argument a = new Argument();
         System.out.println("enter x value");
        int x = sc.nextInt();
           System.out.println("enter y value");

        int y = sc.nextInt();
        a.swap(x, y);
    //      System.out.println(x+" "+y);

    //     // the value of x and y cannot change bacausejava passing primitive type by value when you call x ,y the copy of x y send to the method but not the original value
    //     a.increment(x, y);
    //  System.out.println(x+" "+y);

       

    }
}
