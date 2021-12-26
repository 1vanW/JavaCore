package Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participan> {
    private String name;
    private List<T> listTeam = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipan(T participan){
        listTeam.add(participan);
        System.out.println("В команду " + name + " добавлен новый участник по имени " + ((Participan)participan).getName() );
    }

    public void playwWith(Team<T> team){
        String winner;

        Random rand = new Random();
         int i = rand.nextInt(2);

         if (i == 0){
             winner = this.name;
         }
         else{
             winner = team.name;
         }

        System.out.println("Выйграла команда " + winner);

    }
}
