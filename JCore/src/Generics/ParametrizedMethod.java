package Generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(15);
        arrlist.add(100);


        int a = GenMethod.getSecondElement(arrlist);
        System.out.println(a);

        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("Hello");
        strlist.add("Ivan");
        strlist.add("Java");


        String b = GenMethod.getSecondElement(strlist);
        System.out.println(b);


    }


}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }
}
