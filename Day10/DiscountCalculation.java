package Day10;


class Product{
    public int productid;
     public String name;
     public double price;
     Product(int productid, String name, double price){
        this.productid = productid;
        this.name = name;
        this.price = price;
     }
}
class Electronics extends Product{
   public int warrentyyear;
    public double dprice;
     public Electronics(int productid, String name, double price,int warrentyyear){
     super(productid, name, price);
     this.warrentyyear= warrentyyear;
     }
   public void applyDiscount(){
    if (warrentyyear>2) {
         dprice = (price*100)/15;
         System.out.println(dprice);
    } 
    
   }

   public void display(){
    
    System.out.println("Product Details: ");
    System.out.println("Product Id : "+productid);
    System.out.println("Name : "+name);
    System.out.println("Original Price : "+price);
    System.out.println("Discount price "+dprice);
    System.out.println("Warrenty "+warrentyyear+" years");



   }
}
public class DiscountCalculation {
    public static void main(String[] args) {
        Electronics ele = new Electronics(101, "Lenovo i3", 46000, 3);
                  ele.applyDiscount();

        ele.display();

    }
}
