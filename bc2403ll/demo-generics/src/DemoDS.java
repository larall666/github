package src;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class DemoDS {
  public static void main(String[] args) {
    
  
  Map<String, StringPrinter> map=new HashMap<>();
  StringPrinter sp=new StringPrinter("hello");
  StringPrinter sp2=new StringPrinter("hello");
  map.put("a",sp);
  map.put("b",sp2);
  
  Queue<StringPrinter> qs = new LinkedList<>();
  qs.add(sp);
  qs.add(sp2);
  

sp2.setData("xxx");
map.get("b").setData("zzz");
  System.out.println(map.size());
  System.out.println("qs="+qs);
  
  }
}
