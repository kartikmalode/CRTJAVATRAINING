package Day10;

 class Employee {
public String name;
public double sal;
public void setData(String name,double sal){
    this.name = name;
    this.sal= sal;
}
public String getName(){
    return name;
}
public double getSal(){
    return sal;
}
    
}
class Manager extends Employee{
    private double bonus;
    //set Data method replaced with parameterised constructor

    public Manager(String n, double s){
      super.setData(n,s);
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getIncome(){
        double amt = getSal()+bonus;

        return amt;
    }
}
public class CreateManager {
    public static void main(String[] args) {
        Manager m = new Manager("vijay",5000);
        // m.setData("Ajay", 80000);
        m.setBonus(5000);
         System.out.println("Name of boss "+m.getName());
         System.out.println("Income of boss "+m.getIncome());

    }
    
}
