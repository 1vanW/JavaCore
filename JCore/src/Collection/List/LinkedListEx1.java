package Collection.List;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan",22);
        Student st2= new Student("Anna",20);
        Student st3 = new Student("Maksim",27);
        Student st4 = new Student("Sacha",24);
        Student st5 = new Student("Elena",21);
        Student st6 = new Student("Olga",19);

        LinkedList<Student> linklist = new LinkedList<>();
        linklist.add(st1);
        linklist.add(st2);
        linklist.add(st3);
        linklist.add(st4);
        linklist.add(st5);
        linklist.add(st6);

        System.out.println(linklist);

    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}