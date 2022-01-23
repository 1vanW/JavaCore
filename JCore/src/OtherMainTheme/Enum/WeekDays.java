package OtherMainTheme.Enum;

public enum WeekDays {
    SUNDAY("good"),
    MONDAY("Bad"),
    TUESDAY("Bad"),
    WEDNESDAY("SO so"),
    THURSDAY("So so"),
    FRIDAY("great"),
    SATURDAY("great");

    private String mood;


    private WeekDays(String mood){
        this.mood = mood;
    }

     public String getMood(){
        return mood;
     }
}

class Today{
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo(){
        switch (weekDays){

            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to job");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Can you rest");
                break;






        }

        System.out.println("Nastroenie "+ weekDays.getMood());

    }

    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);

        today.daysInfo();

        System.out.println(today.weekDays);

     WeekDays w1 = WeekDays.FRIDAY;
     WeekDays w2 = WeekDays.FRIDAY;
     WeekDays w3 = WeekDays.MONDAY;

        System.out.println(w1==w2);

        System.out.println(w1==w3);


    }
}
