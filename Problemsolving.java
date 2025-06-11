import java.util.*;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter num1 "+a);
        int b = sc.nextInt();
        System.out.println("enter num2 "+b);

        //for printing space between two number
        System.out.printf("%d%15s%d%n", a,"",b);
    }
}
