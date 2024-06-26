package src.buildin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    Consumer<String>printer=s -> System.out.println(s);
    printer.accept("hello");

    Consumer<List<Integer>>printer2=integers->{
for(Integer num:integers){
  System.out.println(num);
}
    };
    printer2.accept(new ArrayList<>(List.of(13,300,29)));

    BiConsumer<String, Boolean>printer3=(s,b)->{
      if(b==true)
      System.out.println(s);
      else
      System.out.println(s.length());
    };
    printer3.accept("Bootcamp", false);//8

    BiFunction<Integer,Integer, Integer>sum = (x, y) ->{
      return x+y;
    };
    System.out.println(sum.apply(3,4));//7

    List<String> strings=new LinkedList<>();
    strings.add("xyz");
    strings.add("ijk");
    //for-each
    for(String s:strings){}
    //for loop
    for(int i=0;i<strings.size();i++){}
    strings.forEach(s->{
      System.out.println(s);
    });

    //foreach (lambda-Map->BiConsumer)
    Map<String,String>nameMap=new HashMap<>();
    nameMap.put("Vincent", "abc");
    nameMap.put("Jenny", "ijk");
    for(Map.Entry<String,String>entry:nameMap.entrySet()){

    }
    nameMap.forEach((k,v)->{
      System.out.println("K="+k+",v="+v);
    });

    for(String str:strings){
      str="hello";
      System.out.println("inside the loop:"+str);
    }
    System.out.println("outside the loop:"+strings);
    strings.forEach(e->{
      e="hello";
      System.out.println("inside the loop:"+e);
    });
    System.out.println("outside the loop:"+strings);

    Queue<String> q =new LinkedList<>();
    // strings.forEach(e->{
    //   q.add(e);
    // });
    for(String str:strings){
      q.add(str);
      q=new ArrayDeque<>();
    }

  }
    

    
    };
  

