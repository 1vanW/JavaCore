package Collection.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListItteratorExample {
    public static void main(String[] args) {

        String s = "madam";

        List<Character> list = new LinkedList<>();

        for(char ch:s.toCharArray()){

            list.add(ch);
        }

        System.out.println(list);

        ListIterator<Character> list1 = list.listIterator();
        ListIterator<Character> reverselist = list.listIterator(list.size());

        boolean palindrom = true;

        while(list1.hasNext() && reverselist.hasPrevious()){
            if(list1.next()!= reverselist.previous()){
                palindrom = false;
                break;
            }
        }

        System.out.println(palindrom);

    }
}
