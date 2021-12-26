package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3,4,5);

        stream.filter(el-> {
            System.out.println("!!!"); return el % 2 ==0 ;}).collect(Collectors.toList());
    }
}
