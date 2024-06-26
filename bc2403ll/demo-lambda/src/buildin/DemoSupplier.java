package src.buildin;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoSupplier {
  public static void main(String[] args) {
    Supplier<String>hello=()->"hello";
    System.out.println(hello.get());

    Supplier<Weekday>monday=()->Weekday.Monday;
    Weekday monday2=Weekday.MONDAY;
    printName(()->Weekday.MONDAY);

    Supplier<LocalDate>now=()->LocalDate.now();
    System.out.println(now.get());

    Supplier<Integer> random  =()->new Random().nextInt(50)+1;//0-9+1->1-10
    System.out.println(random.get());

    UnaryOperator<String>uppercase=s->s.toUpperCase();
    System.out.println(uppercase.apply("hello"));
  }

  public static void printName(Supplier<Weekday>weekday){
    System.out.println(weekday.get());
  }
}
