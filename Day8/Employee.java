package Day8;

public class Employee {
    private int id;
    private String name;
    private double basicsalary;
    private double bonus;

    public Employee(int id, String name,double basicsalary,double bonus){
        this.id = id;
        this.name = name;
        this.basicsalary = basicsalary;
        this.bonus = bonus;
    }

    public void display(){
        System.out.println(id+" "+name+" "+basicsalary+" "+bonus);
    }
    public void calculateNetSalary(double basicsalary,double bonus){
      double salary = basicsalary+bonus;
      System.out.println("Total Salary "+salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "ajay", 13000, 1000);
        emp.display();
        emp.calculateNetSalary(13000, 1000);
    }
}