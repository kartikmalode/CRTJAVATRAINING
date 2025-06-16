package Day8;

public class TwodMatrix {
    public static void main(String[] args) {
        int [][] arr = {{4,6,9,8},{6,2,3,1},{6,5,4,2}};
        int sum =0,mul=1;

        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
                mul *= arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
