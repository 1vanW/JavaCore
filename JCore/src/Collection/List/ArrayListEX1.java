package Collection.List;

import java.util.ArrayList;

public class ArrayListEX1 {
    public static void main(String[] args) {

        ArrayList<String> arraylist1 = new ArrayList<>();

        arraylist1.add("Ivan");
        arraylist1.add("Anna");
        arraylist1.add("Maksim");

        System.out.println(arraylist1);

        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("!!!");
        arrayList2.add("???");

        arraylist1.addAll(0,arrayList2);


        System.out.println(arraylist1);



    }
}
