package OtherMainTheme.Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {
    public static void main(String[] args) {


        try(BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))) {

            String methodName = reader.readLine();

            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();

            Method method = null;

            Method [] methods = cl.getDeclaredMethods();

            for (Method myMethods :  methods){
                if(myMethods.getName().equals(methodName)){
                    method = myMethods;
                }
            }

            method.invoke(calculator,Integer.parseInt(firstArgument),Integer.parseInt(secondArgument));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        ;
    }
}
