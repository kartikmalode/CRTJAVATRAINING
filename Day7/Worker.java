package Day7;

public class Worker {
    private int hw; // hours worked
    private double payRate;

    public void setData(int hw, double payRate) {
        this.hw = hw;
        this.payRate = payRate;
    }

    public void calculateSalary() {
        double salary;
        if (hw <= 40) {
            salary = hw * payRate;
        } else {
            int overtime = hw - 40;
            salary = (40 * payRate) + (overtime * payRate * 1.5);
        }
        System.out.println("Salary is: " + salary);
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        w.setData(45, 40); // 45 hours at ₹40/hour
        w.calculateSalary(); // should print base + overtime pay
    }
}
