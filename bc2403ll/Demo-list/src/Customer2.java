package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer2 {

  private String name;
  private ArrayList<Order>orders;
  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    ArrayList<Customer2>customers = new ArrayList<>();

    //searching
    for (Customer2 c: customers){
      if(c.getName().equals("Vincent")){

      }
    }
    HashSet<String> strings = new HashSet<>();
    strings.add("abc");
    strings.add("abc");// fasle, data structure of HashSet -> HashMap
    strings.add("ghj");
    System.out.println(strings.size());//2

    // Polymorphism
    List<String> ss = new ArrayList<>();
    ss.add("hello");
    ss.remove(0);
    ss.add("abc");
    ss.add("abc");
    ss.add("abc");
    ss.add("abv");
    System.out.println(ss.get(3));//abv
    System.out.println("ss.size="+ss.size());//4

    //Set (HashSet)
    Set<String> ss2 = new HashSet<>();
    ss2.add("hello");
    ss2.add("hello");
    ss2.add("hello");// fasle, data structure of HashSet -> HashMap
    //ss2.remove("hello");
    System.out.println("ss2.size="+ss2.size());//1

    Collection<String> cs = new ArrayList<>();
    cs.add("hello");
    System.out.println(cs.size());

  
  }
}
