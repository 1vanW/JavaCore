package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee(1,"Ivan","Hohkryakov", 2500);
        Employee emp2 = new Employee(2,"Anna","Hohkryakova", 5000);
        Employee emp3 = new Employee(33,"Maksim","Slabojanin", 3700);
        Employee emp4 = new Employee(17,"Elena","Petrova", 2200);


        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);


        System.out.println("До сортировки: \n" + list );
      Collections.sort(list,new SalaryComparator());
        System.out.println("После сортировки: \n" + list);


    }


}
class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String sourName;
    int salary;

    public Employee(int id, String name, String sourName, int salary) {
        this.id = id;
        this.name = name;
        this.sourName = sourName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourName='" + sourName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if(this.id == anotherEmp.id){
            return 0;
        }
        else if(this.id < anotherEmp.id){
            return -1;
        }
        else{
            return 1;
        }

//        return this.id - anotherEmp.id;
//        return this.id.compareTo(anotherEmp.id);
//        return this.name.compareTo(anotherEmp.name);




    }

//class IdComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if(emp1.id == emp2.id){
//            return 0;
//        }
//        else if(emp1.id < emp2.id){
//            return -1;
//        }
//        else{
//            return 1;
//        }
//    }
}
class NameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary-emp2.salary;
    }
}