package src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List ls = new ArrayList<>();
        //ls.add("ko");
        ls.add(123);
        ls.add(223L);
        ls.add(123.5d);
        // ls.add("fjd");
        System.out.println(ls);

        // System.out.println(((String)ls.get(4)).charAt(2));

        for (Object f : ls) {
            
            if (f instanceof String) {
                String s = (String) f;
                System.out.println(s.concat("world"));
            // }
            // if (f instanceof Integer) {
            //     Integer s = (Integer) f;
            //     System.out.println(s);

                 }else if(f instanceof Long){
                    Long s = (Long) f;
                    System.out.println(s);

            }
        }
        // After Java 1.5 -> Genercis
        // List<Long> ll = new ArrayList<>();
        // ll.add(3L);
    }
}
