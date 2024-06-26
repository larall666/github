package src;

public class App {
    public static void main(String[] args) {
        

        Weekday day = Weekday.FRIDAY;
        switch (day) {
          case MONDAY:
            System.out.println("Monday");
            break;
          case TUESDAY:
            System.out.println("Tuesday");
            break;
          case WEDNESDAY:
            System.out.println("Wednesday");
            break;
          case THURSDAY:
            System.out.println("Thursday");
            break;
          // missing Friday handling (Syntax OK)
          default:
        }
        

        Weekday day2 = Weekday.FRIDAY;
        int value = switch (day2){
            case MONDAY, TUESDAY,THURSDAY ->3;
            case WEDNESDAY, FRIDAY->2;
        };

    }
}
