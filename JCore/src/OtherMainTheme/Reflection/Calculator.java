package OtherMainTheme.Reflection;

public class Calculator {


    void sum(int a , int b ){
        int result = a+b;

        System.out.println("сумма а и b = " + result );
    }

    void substraction(int a, int b){
        int result = a - b;
        System.out.println("Разница а и b = " + result);
    }

    void multiplication(int a , int b){
        int result = a *b ;

        System.out.println("произведение a и b = " + result);
    }
    void division(int a , int b){
        int result = a / b ;

        System.out.println("частное  a и b = " + result);
    }

}
