package Day6;

public class MatrixArr {
    public static void main(String[] args) {
        int arr1[][] = new int[2][];
        arr1[0]= new int[2];
        arr1[1] = new int[3];
        arr1[0][0] = 10;
        arr1[0][1] = 20;

        int [][]arr2 = {{10,20,30,},{50,60},{70,80,90}};
        for(int i = 0; i<arr2.length; i++){
            for(int j =0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
