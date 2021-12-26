package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ivan");
        set.add("Anna");
        set.add("Maksim");
        set.add("Sacha");
//        set.add(null);


        System.out.println(set);

        for (String s: set){
            System.out.println(s);
        }

        set.remove("Ivan");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Alexander"));
        System.out.println(set.contains("Anna"));


    }
}
