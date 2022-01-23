package Regex;

public class PrintFEx {
    static void employeeInfo(Employee emp){
        System.out.printf("%03d \t %12s \t %12s \t %,.1f \n",emp.id,emp.name,emp.surname,emp.salary *(1 *emp.bonusPCT));
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Ivan", "Horyakov", 400, 0.2);
        Employee emp2 = new Employee(102, "Anna", "Horyakova", 800, 0.5);
        Employee emp3 = new Employee(105, "Maksim", "Slabojanin", 640, 0.1);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String st =String.format("%03d \t %12s \t %12s \t %,.1f \n");
    }
}
class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPCT;

    public Employee(int id, String name, String surname, int salary, double bonusPCT) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPCT = bonusPCT;
    }


}