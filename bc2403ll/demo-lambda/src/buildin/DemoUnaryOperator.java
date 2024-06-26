package src.buildin;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
  public static void main(String[] args) {
    Function<String, String>f1=s->s;
    //Function<T,T>
    UnaryOperator<String>addHello=s->s.concat("hello");
    BiFunction<Integer, Integer, Integer> f2=(x,y)->x+y;
    //BiFunction<T, T, T>
    BinaryOperator<Integer>sum=(x,y)->x,y;

    UnaryOperator<String>uppercase=s->s.toUpperCase();
    System.out.println(uppercase.apply("hello"));

    StringFormula formula=
    (str,from,go)->str.toUpperCase().replace(from, go);
    System.out.println(formula.uppercaseNreplace("Hello", "O", "PP"));
  }

  @FunctionalInterface
public interface StringFormula {
  String uppercaseNreplace(String str, String from, String go);
}
}
