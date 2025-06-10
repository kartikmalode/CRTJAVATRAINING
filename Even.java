import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
      System.out.println("Even ");
        for(int i=1; i<=n; i++){
        if(i%2 ==0){
            System.out.println(i+"Number is even ");
          evensum +=i; 
        

        }
    }
          System.out.println("odd ");

    for(int i =1; i<=n; i++){
        if (!(i%2==0)) {
            System.out.println(i +"number is odd");
           oddsum +=i;
            
        }
    }
    System.out.println(evensum);
    System.out.println(oddsum);
    }
}
