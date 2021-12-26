package Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {


        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);


        Student st1 = new Student("Ivan","Hohryakov",3);
        Student st2 = new Student("Anna","Hohryakova",1);
        Student st3 = new Student("Maksim","Slabojanin",4);
        Student st4 = new Student("Aleksander","Hohryakov",3);
        Student st5 = new Student("Olga","Krestova",2);



        linkedHashMap.put(3.2,st1);
        linkedHashMap.put(6.2,st2);
        linkedHashMap.put(4.1,st3);
        linkedHashMap.put(4.5,st4);
        linkedHashMap.put(6.5,st5);


        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(4.1));
        System.out.println(linkedHashMap.get(6.2));

        System.out.println(linkedHashMap);




    }
}
