package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1000,"Ivan Hohryakov");
        map.put(2000,"Anna Hohryakova");
        map.put(3501,"Maksim Slabojanin");
        map.put(4732,"Sacha Mesheryakov");
        map.putIfAbsent(2000,"Egor Novikov");


        System.out.println(map);


        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String,String> map2 = new HashMap<>();
        map2.put("Sacha","Good");
        map2.put("Misha","Sad");
        map2.put("Olga","Great");

        System.out.println(map2.keySet());




    }


}
