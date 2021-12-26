package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "How are you?","I`m fine");

//        for (String s: list){
//            System.out.println(s);
//        }

//        list.forEach(str -> System.out.println(str));
        List<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(6);
        list2.add(2);
        list2.add(8);
        list2.add(11);

        list2.forEach(el -> {el = el* 2;
            System.out.println(el);});


        for(Integer i: list2){
            System.out.println(i);
        }

    }


}
