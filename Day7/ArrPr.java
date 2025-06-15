package Day7;

public class ArrPr {
    //WAP for finding n given from user in a set of array if it is not found print by come tomm;
    public static void main(String[] args) {
        int arr[] ={5,6,7,8,9};
        int n =8;
        
        for(int i =0; i<arr.length;i++){
            if (arr[i]==n) {
                System.out.println("number is found "+i);
                break;
                
            }else{
                System.out.println("by come tomm");
            }
        }
    }
}
