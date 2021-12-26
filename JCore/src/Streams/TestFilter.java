package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan",'m',27,3,7.5);
        Student st2 = new Student("Anna",'f',25,2,8.7);
        Student st3 = new Student("Maksim",'m',26,4,8.3);
        Student st4 = new Student("Oleg",'m',29,5,9.0);
        Student st5 = new Student("Elena",'f',27,3,7.2);


        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().map(element-> {element.setName(element.getName().toUpperCase());

        return element;
        }).filter(element -> element.getSex() =='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(element -> System.out.println(element));







//       students = students.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//
//        System.out.println(students);





//        List<Student> students1 = students.stream().filter(element -> element.getAge() > 25 && element.getAvgGrade() < 8.0).collect(Collectors.toList());
//        System.out.println(students1);


//        Stream<Student> mystream = Stream.of(st1,st2,st3,st4);


//        mystream.forEach(System.out::println);


//        List<Student> integers = mystream.filter(el-> el.getCourse() == 3).collect(Collectors.toList());
//        System.out.println(integers);

    }
}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}