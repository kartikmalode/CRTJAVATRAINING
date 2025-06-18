package Day10;
 class Employee {
   public String name;
   public int empid;
   public double salary;

    Employee(String name,int empid,double salary){
    this.name = name;
    this.empid = empid;
    this.salary = salary;
   }
    
}
class Manager extends Employee{
     String dept;
     double rating;
     double bonus;
    public Manager(String name,int empid,double salary){
        super(name, empid, salary);
    }

   public void department(String dept){
         this.dept = dept; 
   }
   public void calculatebonus(double rating){
             if (rating >=4.5) {
                bonus = (salary/100)*20;
             }else if (rating >= 3.5) {
            bonus = (salary/100)*10;

             }else{
                System.out.println("NO BONUS");
             }
   }
   public void display(){
    System.out.println("Manager Details: ");
    System.out.println("Name : "+name);
    System.out.println("Employee ID : "+empid);
    System.out.println("Salary : "+salary);
    System.out.println("Department : "+dept);
    System.out.println("Bonus : "+bonus);

   }
}
public class EmpManager {
    public static void main(String[] args) {
        Manager m = new Manager("Amit Gupta",101,80000);
        m.department("Finance");
         m.calculatebonus(4.7 );
         m.display();
    }
}
