package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestReduce {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(3);

       int res =  list.stream().reduce(0,(accumulator,elem)-> accumulator + elem);

        System.out.println(res);
//
//        List<Integer> list100 = new ArrayList<>();

//       Optional<Integer> optionalInteger = list.stream().reduce((accumulator, elem)-> accumulator * elem);
//
//       if(optionalInteger.isPresent()){
//           System.out.println(optionalInteger.get());
//       }
//       else {
//           System.out.println("Not present");
//       }

        List<String> list3 = new ArrayList<>();

        list3.add("Hello");
        list3.add("Good bye");
        list3.add("How are you?");
        list3.add("I`m fine");

        String res3 = list3.stream().reduce((accumulator,el) -> accumulator + " " + el).get();

        System.out.println(res3);


    }
}
