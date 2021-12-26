package Collection.Set;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer>set1 = new HashSet<>();

        set1.add(5);
        set1.add(10);
        set1.add(27);
        set1.add(41);
        set1.add(2);

        HashSet<Integer>set2 = new HashSet<>();

        set2.add(5);
        set2.add(10);
        set2.add(3);
        set2.add(4);
        set2.add(2);

        HashSet<Integer>subtract = new HashSet<>(set1);

       subtract.removeAll(set2);



        System.out.println(subtract);


    }
}
