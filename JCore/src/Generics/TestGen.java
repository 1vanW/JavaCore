package Generics;

import java.util.ArrayList;
import java.util.List;

public class TestGen {
    public static void main(String[] args) {
        List <String>list = new ArrayList<String>();
//        list.add("Ok");
//        list.add(1);
//        list.add(new StringBuilder("Hello"));
//        list.add(new Car());

        list.add("Hello");
        list.add("bye");
        list.add("ok");
        list.add("some string");


        for (Object o: list){
            System.out.println(o +" length o " + ((String)o).length());
        }


    }
}
