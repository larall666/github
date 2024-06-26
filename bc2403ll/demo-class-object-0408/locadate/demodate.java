import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Random;

public class demodate {
  public static void main(String[] args) {
    LocalDate day = LocalDate.of(2023, 12,1);
    System.out.println(day.toString());//2023-12-01

    LocalDate day2 = LocalDate.of(2023, 12,1);
    System.out.println(day2.toString());//2023-12-01

    System.out.println(day == day2); //false
System.out.println(day.compareTo(day2)); //0
System.out.println(day.isEqual(day2)); //true

System.out.println(System.identityHashCode(day));
System.out.println(System.identityHashCode(day2));

System.out.println(day.isAfter(LocalDate.of(2023,11,30)));//true
System.out.println(day.isBefore(day2));//false

int year = day.getYear();
Month month = day.getMonth();
System.out.println(month.length(false));//31


System.out.println(Month.of(2).length(true));//29

Year y1 = Year.of(2024);
System.out.println(day.getDayOfWeek().toString());

int random = new Random().nextInt(3);

System.out.println("day="+day.plusDays(31).toString());
LocalDate day3 = day.plusMonths(2);
    LocalDate day4 = day.plusYears(4);
    System.out.println("day3="+day3);
    System.out.println("day4="+day4.toString());

    LocalDate today = LocalDate.now();
    System.out.println(today.toString());
  }
}
