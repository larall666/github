package src;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) throws Exception {
        List<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.remove(0);
        strings.add("def");

        Queue<String> strings2 = (Queue<String>) strings;
        strings2.add("abc");
        System.out.println(strings2.size());

        System.out.println(strings2.poll());
        System.out.println("strings2="+strings2);
        System.out.println(strings2.poll());
        System.out.println(strings2.poll());

        strings2.add("xyz");
        strings2.add("ijk");
        strings2.add("xyz");
        System.out.println(strings2.size());
        System.out.println(strings2.peek());
        //strings.remove(0);
        System.out.println(strings2.size());
        System.out.println(strings2);

        while (!strings2.isEmpty()) {
            System.out.println(strings2.poll());
        }
        System.out.println(strings2.size());

        strings.add("Vincent");

        Queue<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(101);
        integers.add(2);
        integers.add(99);
        integers.add(-8);

        int size = integers.size();
        int val=-1;
        while (size-->0) {
            val=integers.poll();
            if(val%2==1)
            integers.add(val);
            
        }
        System.out.println(integers);

        System.out.println(integers.size());
    }

}
