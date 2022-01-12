package IOandNIO.Serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    static final long serialVersionVUD = 2;
    String name;
    String surname;
//    int age;
    String department;
    transient double salary;
    Car car;

    public Employee(String name, String surname , String department, double salary,Car car) {
        this.name = name;
//        this.age = age;
        this.department = department;
        this.salary = salary;
        this.car = car;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "Surname : " + surname +
//                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                "Car = " + car +

                '}';
    }
}
