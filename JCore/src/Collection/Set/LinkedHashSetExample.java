package Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(3);
        set.add(6);
        set.add(8);
        set.remove(8);

        System.out.println(set);

        System.out.println(set.contains(3));


    }
}
