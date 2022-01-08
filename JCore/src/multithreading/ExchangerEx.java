package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> Listfriend1 = new ArrayList<>();
        Listfriend1.add(Action.KNIFE);
        Listfriend1.add(Action.PAPER);
        Listfriend1.add(Action.KNIFE);
        List<Action> Listfriend2 = new ArrayList<>();
        Listfriend2.add(Action.PAPER);
        Listfriend2.add(Action.KAMEN);
        Listfriend2.add(Action.KAMEN);

        new BestFriend("Ivan",exchanger,Listfriend2);
        new BestFriend("Anna",exchanger,Listfriend1);




    }
}

enum Action{
    KAMEN,
    KNIFE,
    PAPER;
}
class BestFriend extends Thread{
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> myAction;

    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> mylist){
        this.name = name;
        this.exchanger = exchanger;
        this.myAction = mylist;
        this.start();
    }




    public void WhoWins(Action myAction, Action myFriend){
        if(myAction == Action.KAMEN && myFriend == Action.KNIFE
                || myAction == Action.KNIFE && myFriend == Action.PAPER
                || myAction == Action.PAPER && myFriend == Action.KAMEN){

            System.out.println("Win of the game " + name);
        }

    }

    @Override
    public void run() {
        Action reply;
        for(Action action: myAction){
            try {
                reply =exchanger.exchange(action);
                WhoWins(action,reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
