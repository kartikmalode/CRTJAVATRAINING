package Day10;

public class ExceptionHandling {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int a=5;
        int b= 0;
        try {
            
            int c = a/b;
            arr[15]=15;
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("array index not found");
        }catch(ArithmeticException e){
            System.out.println("Value is not divide by 0");
        }
    }
}
