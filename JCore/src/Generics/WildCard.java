package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);

        showListInfo(list1);
        
        List <String> list3 = new ArrayList<>();
        
        list3.add("Hello");
        list3.add("Goodbye");
        list3.add("Ok");

        showListInfo(list3);

        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(1.34);
        arrayList.add(1.37);
        arrayList.add(1.32);
        arrayList.add(1.1);

        System.out.println(sum(arrayList));

        ArrayList<Integer> arist = new ArrayList<>();

        arist.add(3);
        arist.add(3);
        arist.add(3);
        arist.add(3);

        System.out.println(sum(arist));




    }

    public static void showListInfo(List<?> list){
        System.out.println("Лист содержит " + list);
    }


    public static double sum(ArrayList <? extends Number> a){
        double sum = 0;
        for (Number n : a){
            sum+=n.doubleValue();

        }

        return sum;
    }
}
