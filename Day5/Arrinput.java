package Day5;

public class Arrinput {
    public static void main(String[] args) {
        int n ,sum = 0;
        n = args.length;
         
        if(n<=1){
            System.out.println("enter at least 2 num");
            System.exit(0);  
        }
        for(int i =0; i<n; i++){
            sum = sum +Integer.parseInt(args[i]);
        }
        System.out.println("sum is"+sum);
        //java Arrinput.java 10 20 30  for running the code
    }
}
