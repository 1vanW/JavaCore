package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lesson_1 {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        list.add("Ivan");
        list.add("Zaur");
        list.add("Anna");
        list.add("Maksim");

        System.out.println("Перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки");
        System.out.println(list);

    }
}
