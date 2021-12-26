package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;


public class StudentInfo {


    private static double avgOfSmth(List<Student> list,Function<Student,Double> func){
        double result = 0;
        for (Student s:list){
            result +=func.apply(s);


        }
        result = result /list.size();
        return result;
    }


    void testStudents(ArrayList<Student> students,Predicate<Student> sc ){
        for(Student s: students){
            if(sc.test(s)){
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',28,3,8.1);
        Student st2 = new Student("Zaur",'m',33,5,9.2);
        Student st3 = new Student("Anna",'f',25,3,8.7);
        Student st4 = new Student("Maksim",'m',26,4,7.3);
        Student st5 = new Student("Olga",'f',27,2,6.4);

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);


        StudentInfo studentInfo = new StudentInfo();

//        studentInfo.testStudents(arrayList,new CheckOverGrade());

        System.out.println("------------");

//        Function<Student, Double> f = student -> {return student.avgGrade };

        double result = avgOfSmth(arrayList, (Student s) -> {return (double)s.age;});

        System.out.println(result);
















//        Predicate<Student> p1 = stud -> stud.avgGrade < 7.5;
//        Predicate<Student> p2 = stud -> stud.sex == 'm';
//
//        studentInfo.testStudents(arrayList,p1.negate());
////        studentInfo.testStudents(arrayList,p2);

//        studentInfo.testStudents(arrayList, new StudentChecks() {
//            @Override
//            public boolean checkStudent(Student s) {
//                return s.age < 28;
//            }
//        });
//
//        System.out.println("------------");
//
//        studentInfo.testStudents(arrayList ,(Student s) -> {return s.age < 28;});
//
//        System.out.println("------------");
//
 //       studentInfo.testStudents(arrayList, (Student s) -> {return s.sex == 'f';});
//
//        System.out.println("------------");
//
//        studentInfo.testStudents(arrayList, (Student s) ->{ return s.avgGrade < 7.0;} );
//
//        System.out.println("------------");
//
//        studentInfo.testStudents(arrayList, ( s -> {return s.course < 4;}));








    }

}
//@FunctionalInterface
//interface StudentChecks{
//    boolean checkStudent(Student s);
//}
//
//class CheckOverGrade implements StudentChecks{
//
//    @Override
//    public boolean checkStudent(Student s) {
//        return s.avgGrade > 8;
//    }
//}