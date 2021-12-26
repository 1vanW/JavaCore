package Streams;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test1 {


    public static  void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Good bye");
        list.add("How are you?");
        list.add("I`m fine");

//        for(int i = 0; i < list.size(); i++){
//            list.set(i,String.valueOf(list.get(i).length()));
//
//        }

//        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
//
//        System.out.println(list);

        int [] array = {5,9,3,8,1};

        int [] array2 = Arrays.stream(array).map(element ->
        {if(element%3 == 0)
        {element = element / 3;}
        return element;


        }).toArray();

//        System.out.println(Arrays.toString(array2));

        Set<String> set = new TreeSet<>();

        set.add("Hello");
        set.add("Good bye");
        set.add("How are you?");
        set.add("I`m fine1");

        System.out.println(set);

        Set<Integer> set2 = set.stream().map(element -> element.length()).collect(Collectors.toSet());

        System.out.println(set2);


    }
}
