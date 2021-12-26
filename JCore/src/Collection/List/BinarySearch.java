package Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {
    static void swap(int a , int b){
        a = a+b;
        b = a -b;
        a = a - b;
        System.out.println(a);

        System.out.println(b);
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(19);
        list.add(-23);
        list.add(-65);
        list.add(-4);
        list.add(7);
        list.add(169);
        list.add(71);
        list.add(33);
        list.add(11);
        list.add(-7);

        Collections.sort(list);

        int index = Collections.binarySearch(list,7);


        swap(9,14);
    }
}

