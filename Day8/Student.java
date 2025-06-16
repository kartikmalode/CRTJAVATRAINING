package Day8;

import java.util.Scanner;

public class Student {
    private int rollnumber;
    private String name;
    private String course;

    public Student(int r, String n, String c){
      rollnumber=r;
      name = n;
      course = c;
    }
    public void displayDetails(){
        System.out.println("Roll No : "+rollnumber+" Name : "+name+ " Course : "+course);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollnumber = sc.nextInt();
        String name = sc.nextLine();
        String course = sc.nextLine();
        Student s = new Student(rollnumber, name, course);
        s.displayDetails();
    }
}
