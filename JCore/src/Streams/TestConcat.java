package Streams;

import java.util.stream.Stream;

public class TestConcat {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1);
        Stream<Integer> stream2 = Stream.of(1,6,7,8,9,10);
//        Stream<Integer> stream3 = Stream.of(11,12,13);
//        Stream<Integer> stream4 = Stream.of(20,30,40);
//        Stream<Integer> stream5 = Stream.concat(stream,stream2);
//        stream5.forEach(System.out::println);


//        stream.distinct().forEach(System.out::println);

        System.out.println(stream.distinct().peek(System.out::println).count());


    }
}
