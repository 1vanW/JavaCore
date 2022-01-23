package OtherMainTheme.Reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10,"Anna","it");

        Class empClass = employee.getClass();

        Field someField = empClass.getDeclaredField("salary");
        someField.setAccessible(true);
        double salary = (double)someField.get(employee);

        System.out.println(salary);
        someField.set(employee,1500.0);
        System.out.println(employee);
    }
}
