package OtherMainTheme.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("OtherMainTheme.Reflection.Employee");

        Field someField = employeeClass.getField("id");

//        System.out.println(someField.getType());
//
//        Field [] fields = employeeClass.getDeclaredFields();
//
//        for(Field field: fields){
//            System.out.println("Type of " + field.getName() + " = " + field.getType() );
//        }


//       Method someMethod =  employeeClass.getMethod("increaceSalary");
//
//        System.out.println("Return type = " + someMethod.getReturnType() + " parametrs type = "  + Arrays.toString(someMethod.getParameterTypes()));

//        Method [] methods = employeeClass.getDeclaredMethods();
//
//        for (Method method: methods){
//            System.out.println(method);
//        }


        Constructor [] constructor = employeeClass.getConstructors();

       for (Constructor constructor1 : constructor){
           System.out.println("Constructor " + constructor1.getName() + " has " + Arrays.toString(constructor1.getParameterTypes()));
       }
    }
}
