package Collection.Map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double,Student> hashtable = new Hashtable<>();

        Student st1 = new Student("Ivan","Hohryakov",3);
        Student st2 = new Student("Anna","Hohryakova",1);
        Student st3 = new Student("Maksim","Slabojanin",4);
        Student st4 = new Student("Aleksander","Hohryakov",3);
        Student st5 = new Student("Olga","Krestova",2);



        hashtable.put(3.2,st1);
        hashtable.put(6.2,st2);
        hashtable.put(4.1,st3);
        hashtable.put(4.5,st4);
        hashtable.put(6.5,st5);

        System.out.println(hashtable);







    }
}
