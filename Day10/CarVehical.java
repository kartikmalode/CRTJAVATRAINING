package Day10;

 class Vehical {
public String brand;
public String model;
public String fueltype;
public int price;

public void getDetails(String brand, String model,int price,String fueltype){
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.fueltype = fueltype;
}

    
}
 class Car extends Vehical {
   private String fuel;
   private int distance;
   private int fuelConsumed;
   public Car(String brand, String model,int price, String fueltype){
      super.getDetails(brand,model,price,fueltype);
   }
   public String fuelType(String fuel){
  return fuel;
   }
   int milege;
   public void calculateFuelEfficiency(int distance, int fuelConsumed){
     milege =  distance/fuelConsumed;
   }
    public void show(){
        System.out.println("Car details :");
        System.out.println("Brand : "+brand);
       System.out.println("Model : "+model);
         System.out.println("Price : "+price);
        System.out.println("Fuel type : "+fueltype);
          System.out.println("Milege : "+milege+"km/l");




    }
}
public class CarVehical {
    public static void main(String[] args) {
        Car c = new Car("Toyata"," Camry",50000,"Petrol");
        c.calculateFuelEfficiency(500, 25);
        c.show();
        
    }
}
