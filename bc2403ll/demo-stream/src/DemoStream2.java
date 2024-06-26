package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static void main(String[] args) {
    Stream<String>empty=Stream.empty();
    System.out.println(empty.count());//0

    Stream<String> strings=Stream.of("Hello","abc","ooooo");
    System.out.println(strings);
    //filter, collect

    Stream<Integer>integers=Stream.iterate(1, n->n+2).limit(10);
    System.out.println(integers.collect(Collectors.toList()));

    strings=strings.filter(e->e.length()>3);
    System.out.println(strings.collect(Collectors.toList()));//Hello

    //stream->forEch
    // strings.forEach(e->{
    //   System.out.println(e);
    // });

    // sorted()
    List<Integer>integers2=new ArrayList<>(List.of(400,3,-1,0,100,-200));
    List<Integer>integers3=integers2.stream()
    .filter(e->e.compareTo(3)>=0)
    //or .filter(e->e>=3)
    .sorted()
    .collect(Collectors.toList());
    System.out.println(integers3);

    List<Customer>customers=new LinkedList<>(
      List.of(new Customer(13, "Vincent"),
      new Customer(18, "Tommy"),new Customer(15, "Jenny"),new Customer(18, "Jenny")));

      Comparator<Customer>sortByAgeDesc=
      (c1,c2)->c1.getAge()>c2.getAge()?-1:1;

      List<Customer>sortCustomers=customers.stream()
      .sorted(sortByAgeDesc)
      .collect(Collectors.toList());
      System.out.println(sortCustomers);

    //   List<Customer>customers2=customers.stream()
    //   .filter(e->e.compareTo(3)>=0)
    //   .sorted()
    //   .collect(Collectors.toList());
    // System.out.println(customers2);
    System.out.println(" ");
    // Set<String> names=customers.stream()
    // //.filter(e->e.getAge()>13)
    // // .map(e->e.getName())
    // .map(c->c.getName())
    // .filter(name->name.startsWith("J"))
    // .sorted()
    // // .collect(Collectors.toList());
    // .collect(Collectors.toSet());

    Map<Character, String> nameMap=customers.stream()
    //.filter(e->e.getAge()>13)
    // .map(e->e.getName())
    .map(c->c.getName())
    .filter(name->name.startsWith("J"))
    .sorted()
    // .collect(Collectors.toList());
    .distinct()
    .collect(Collectors.toMap(s->s.charAt(0),s->s));
    System.out.println(nameMap);

    Stream.of(1,2,3).map(i->{
      System.out.println(i);
      // return i;//112233
      return i+1;//122334
    }).forEach(e->System.out.println(e));
     
    
  }
}
