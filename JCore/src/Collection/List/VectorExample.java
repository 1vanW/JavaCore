package Collection.List;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Ivan");
        vector.add("Anna");
        vector.add("Maksim");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);

        System.out.println(vector.get(1));


    }
}
