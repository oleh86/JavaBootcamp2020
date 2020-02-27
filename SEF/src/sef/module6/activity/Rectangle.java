package sef.module6.activity;

import sef.module6.sample.Employee_A;
import sef.module6.sample.Person_A;
import sef.module6.sample.Student_A;
import sef.module6.sample.Student_P;

public class Rectangle extends Shape {
}
private double length;
private double breadth;
    //Behavior - default constructor
    public Rectangle(){
    }

    //Behavior - parameterized constructor
     Rectangle(double length; double breadth){
        this.length = length;
        this.breadth = breadth;
    }
public double caculateArea(){
    double area = length*breadth;
        return area;
        }
public double caculatePerimeter(){
        double perimeter = 2*(length*breadth);
        return perimeter;
        }
public class AbstractionSample {

    public static void main(String[] args) {

        // Person_A is abstract class so cannot be instantiated. Following gives error
        // Person_A p = new Person_A();

        Person_A pE = new Employee_A();
        pE.setAge(21);
        pE.setName("Smith");

        Person_A pS = new Student_A();
        pS.setAge(15);
        pS.setName("Rita");

        Employee_A e = new Employee_A();
        e.setAge(33);
        e.setName("Raju");
        e.setSalary(80000);
        e.setTitle("Programmer");

        Student_A s = new Student_A();
        s.setAge(13);
        s.setGrade(8);
        s.setName("Henry");
        s.setSchool("ABC School");

        System.out.println("---------------------------");
        System.out.println("Employee Age          : " +pE.getAge());
        System.out.println("Employee Name         : " +pE.getName());

        System.out.println("---------------------------");
        System.out.println("Student Age           : " +pS.getAge());
        System.out.println("Student Name          : " +pS.getName());

        System.out.println("---------------------------");
        System.out.println("Employee Age          : " +e.getAge());
        System.out.println("Employee Name         : " +e.getName());
        System.out.println("Employee Salary       : " +e.getSalary());
        System.out.println("Employee Title        : " +e.getTitle());

        System.out.println("---------------------------");
        System.out.println("Student Age           : " +s.getAge());
        System.out.println("Student Name          : " +s.getName());
        System.out.println("Student Grade         : " +s.getGrade());
        System.out.println("Student School        : " +s.getSchool());






    }

}