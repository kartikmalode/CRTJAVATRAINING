package Day3;
public class PR2 {
    public static void main(String[] args) {
        int r = 10;
        int h = 15;

        //cylender
        double ca = 2*Math.PI*r*h;

        double volume = Math.PI*Math.pow(r, 2)*h;
        //total surface area
        double tsa = 2*Math.PI*r*(r+h);

        System.out.println("cylinder "+ca);
        System.out.println("volume "+volume);
        System.out.println("Total area surface "+tsa);
    }
}
