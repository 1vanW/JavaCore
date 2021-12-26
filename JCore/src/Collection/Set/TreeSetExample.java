package Collection.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(10);
        System.out.println(set);

        set.remove(2);
        System.out.println(set);

        System.out.println(set.contains(1));


    }
}
