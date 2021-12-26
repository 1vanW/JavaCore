package Collection.Set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Ivan",2);
        Student st2 = new Student("Anna",3);
        Student st3 = new Student("Maksim",5);
        Student st4 = new Student("Sacha",4);
        Student st5 = new Student("Oleg",2);
        Student st6 = new Student("Olga",5);


        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);

//        System.out.println(treeSet);
//
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        System.out.println(treeSet.tailSet(st5));

//        System.out.println(treeSet.subSet(st5,st6));

        System.out.println(st3.equals(st6));

        System.out.println(st3.hashCode());
        System.out.println(st6.hashCode());



    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course-otherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash( course);
    }
}
