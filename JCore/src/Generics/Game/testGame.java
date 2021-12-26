package Generics.Game;

public class testGame {
    public static void main(String[] args) {
        Shcolar shcolar1 = new Shcolar("Ivan",16);
        Shcolar shcolar2 = new Shcolar("Anna",15);

        Shcolar shcolar3 = new Shcolar("Sergey",17);
        Shcolar shcolar4 = new Shcolar("Natsha",16);

        Student student1 = new Student("Maksim", 22);
        Student student2 = new Student("Elena", 19);

        Employee employee1 = new Employee("Sacha", 25);
        Employee employee2 = new Employee("Karina",23);


        Team <Shcolar>shcolarTeam = new Team("Hobbits");
        shcolarTeam.addNewParticipan(shcolar1);
        shcolarTeam.addNewParticipan(shcolar2);

        Team <Student> studentTeam = new Team<>("Dargons");

        studentTeam.addNewParticipan(student1);
        studentTeam.addNewParticipan(student2);

        Team<Employee> employeeTeam = new Team<>("Slaves");

        employeeTeam.addNewParticipan(employee1);
        employeeTeam.addNewParticipan(employee2);

        Team <Shcolar> shcolarTeam2 = new Team("Dwarfs");

        shcolarTeam2.addNewParticipan(shcolar3);
        shcolarTeam2.addNewParticipan(shcolar4);

        shcolarTeam.playwWith(shcolarTeam2);




    }
}
