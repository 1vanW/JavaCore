package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',27,3,7.5);
        Student st2 = new Student("Anna",'f',25,2,8.7);
        Student st3 = new Student("Maksim",'m',26,4,8.3);
        Student st4 = new Student("Oleg",'m',29,5,9.0);
        Student st5 = new Student("Elena",'f',27,3,7.2);

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(st1);
        listStudents.add(st2);
        listStudents.add(st3);
        listStudents.add(st4);
        listStudents.add(st5);

//        Map<Integer,List<Student>> map = listStudents.stream().map(el -> {el.setName(el.getName().toUpperCase());
//        return el;}).collect(Collectors.groupingBy(el -> el.getCourse()));
//
//
//        for(Map.Entry <Integer,List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


       Map<Boolean,List<Student>> map =
               listStudents.stream().map(el -> {el.setName(el.getName().toUpperCase());
      return el;}).collect(Collectors.partitioningBy(el -> el.getAvgGrade()> 7));


        for(Map.Entry <Boolean,List<Student>> entry : map.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
