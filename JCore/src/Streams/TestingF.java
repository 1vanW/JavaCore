package Streams;

import java.util.ArrayList;
import java.util.List;

public class TestingF {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',27,3,7.5);
        Student st2 = new Student("Anna",'f',25,2,8.7);
        Student st3 = new Student("Maksim",'m',26,4,8.3);
        Student st4 = new Student("Oleg",'m',29,5,9.0);
        Student st5 = new Student("Elena",'f',27,3,7.2);

        Faculty f1 = new Faculty("Economics");

        Faculty f2 = new Faculty("Math");

        f1.addStudentFaculty(st1);
        f1.addStudentFaculty(st2);
        f1.addStudentFaculty(st3);

        f2.addStudentFaculty(st4);
        f2.addStudentFaculty(st5);

        List<Faculty> listFaculty = new ArrayList<>();

        listFaculty.add(f1);
        listFaculty.add(f2);

        listFaculty.stream().flatMap(faculty -> faculty.getStudentsOnFaculty()
                .stream())
                .forEach(s -> System.out.println(s.getName()));
    }
}
class Faculty{
    String name;
   private List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty(){
        return studentsOnFaculty;
    }

    public void addStudentFaculty(Student st){
        studentsOnFaculty.add(st);
    }
}