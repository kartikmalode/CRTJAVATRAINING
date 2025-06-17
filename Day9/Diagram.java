package Day9;

public class Diagram {
    private double length;
    private double height;
    private double bredth;
     private double radius;
     public Diagram(double length,double height,double bredth,double radius){
        this.length=length;
        this.height= height;
        this.bredth=bredth;
        this.radius= radius;
     }


    public double circle(double radius){
      return Math.PI*radius*radius;
    }
    public double area(double length,double bredth){
        double area = length*bredth;
     return area;
    }
    public double cylinder(double radius, double height){
        return 2*Math.PI*radius*height;
    }
    // public double squre(){

    // }
    // public double traingle(){

    // }

    public static void main(String[] args) {
        Diagram d = new Diagram(5, 8, 9, 7);
        d.area(5, 6);
    }
}
