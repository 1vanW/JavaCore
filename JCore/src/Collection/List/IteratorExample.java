package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();

        arraylist1.add("Ivan");
        arraylist1.add("Anna");
        arraylist1.add("Maksim");

        Iterator<String> iterator = arraylist1.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(arraylist1);
    }
}
