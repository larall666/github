package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
LinkedList<String> strings=new LinkedList<>();
strings.add("hello");
strings.add("abc");

        System.out.println(strings.size());
        strings.remove(1);
        System.out.println(strings);
        System.out.println(strings.contains(new String ("hello")));

        List<String> ls = new LinkedList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("Vincent");
        for(int i = 0;i<ls.size();i++){
           
            System.out.println(ls.get(i));
        }
        System.out.println(ls.get(1));
            
        // for-each
        for(String s : ls){
            if("def".equals(s))
            System.out.println("this is def");
            break;
        }

        LinkedList<String> lll = new LinkedList<>();
        lll.add("hello");
        lll.addLast("abc");
        lll.addFirst("Jenny");
        System.out.println("lll="+lll);
        System.out.println(lll.get(1));
          boolean containsBanana = lll.contains("abc");
    System.out.println(containsBanana);

        ArrayList<String> as = new ArrayList<>();
        as.add("hello");
        as.add("ijk");
        as.add("def");
        as.remove(1);
        System.out.println(as);

    }
}
