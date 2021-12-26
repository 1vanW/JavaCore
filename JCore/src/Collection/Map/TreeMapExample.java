package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Ivan","Hohryakov",3);
        Student st2 = new Student("Anna","Hohryakova",1);
        Student st3 = new Student("Maksim","Slabojanin",4);

        Student st4 = new Student("Olga","Krestova",2);


        treeMap.put(4.1,st1);
        treeMap.put(4.8,st2);
        treeMap.put(4.9,st3);
        treeMap.put(5.1,st4);




//        System.out.println(treeMap);
//        Student st5 = new Student("Olga","Krestova",2);
//
//        System.out.println(st4.equals(st5));
//
//        System.out.println(treeMap.containsKey(st5));



//        treeMap.remove(4.3);
//
//        System.out.println(treeMap);


//        System.out.println(treeMap.descendingMap());

//        System.out.println(treeMap.tailMap(5.0));
//
//        System.out.println(treeMap.headMap(5.0));
//
//        System.out.println(treeMap.lastEntry());
//
//        System.out.println(treeMap.firstEntry());





    }
}
