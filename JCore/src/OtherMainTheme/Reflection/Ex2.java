package OtherMainTheme.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class employeeClass = Class.forName("OtherMainTheme.Reflection.Employee");

//        Employee o = (Employee) employeeClass.newInstance();
//        System.out.println(o);

//        Constructor<Employee> constructor1 = employeeClass.getConstructor();
//
//        Employee emp = constructor1.newInstance();
//
//        System.out.println(emp);

        Constructor constructor2 = employeeClass.getConstructor(int.class,String.class,String.class);

        Object obj = constructor2.newInstance(100,"Ivan","it");

        System.out.println(obj);
        Method method = employeeClass.getMethod("setSalary", double.class);

        method.invoke(obj,200.5);
        System.out.println(obj);



    }
}
