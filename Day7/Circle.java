package Day7;

public class Circle {
    private double radius;
    public void setRadius(double r){
     radius = r;
    }
    public double calculateArea(){
      return Math.PI *radius*radius;
    }
    public double calculateCurcumference(){
     return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(12);
       System.out.println(c.calculateArea()); 
        System.out.println(c.calculateCurcumference());
    }
}
