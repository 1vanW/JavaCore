package Collection.Queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Anna",3);
        Student st3 = new Student("Maksim",5);
        Student st4 = new Student("Sacha",4);
        Student st5 = new Student("Oleg",2);
        Student st6 = new Student("Olga",5);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        priorityQueue.add(st6);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());




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
