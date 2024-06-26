package src;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Predicate<String>isTooLong=s->s.length()>10;
    }
    
}
