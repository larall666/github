package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemoDeque {
  public static void main(String[] args) {
    
  Deque<String> strings = new LinkedList<>();
  strings.add("hello");
  strings.add("abc");
  strings.addFirst("ijk");
System.out.println(strings);

System.out.println(strings.pollLast());
System.out.println(strings);
System.out.println(strings.size());

strings.add("world");
System.out.println(strings);

System.out.println("pop="+strings.pop());
System.out.println(strings);
strings.push("hi");
strings.add("yu");
System.out.println(strings);
System.out.println("strings.pop="+strings.pop());
System.out.println("getFirst="+strings.getFirst());

//stack(pop, push)
List<String> strings3=new Stack<>();
strings3.add("hello");


Stack<String>strings4=new Stack<>();
strings4.push("hello");
strings4.push("hello2");
System.out.println(strings4);
System.out.println("strings4.pop="+strings4.pop());
System.out.println(strings4);

Queue<String> qs = new ArrayDeque<>();
qs.add("hello");
qs.add("abc");
System.out.println(qs.poll());

qs.add("x");
qs.add("y");
qs.remove();
System.out.println(qs);

Deque<String> ds2 = new LinkedBlockingDeque<>(2);


  }
}
