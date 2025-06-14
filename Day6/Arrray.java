package Day6;

public class Arrray {
    
    public static void main(String[] args) {
        int array[][]= {{4,8,9,7},{6,3,2,5},{8,7,6,3},{1,0,0,2}};
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                sum = sum +array[i][j];
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int totalelement = array.length *array[0].length;
        System.out.println("sum is "+ sum + " Avrage is "+((float)sum/totalelement));
    }
}
