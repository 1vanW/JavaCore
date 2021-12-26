package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Good Bye");
        list.add("Ok");
        list.add("Learn Java");
        list.add("Lambda Expression");

//        list.removeIf(element -> element.length() < 5);

        Predicate<String> p = element -> element.length() < 5;
        list.removeIf(p);
        System.out.println(list);
    }
}
