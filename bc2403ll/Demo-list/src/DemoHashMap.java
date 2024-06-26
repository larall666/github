package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    HashMap<String, Integer>mapper = new HashMap<>();
    mapper.put("John", Integer.valueOf(13));// put an "entry" into map
    mapper.put("Vincent",18);
    System.out.println(mapper.get("Vincent"));
    System.out.println(mapper.get("John"));

    //for-each
    for (Map.Entry<String, Integer> m:mapper.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
      
      mapper.put("Vincent", 20);
      System.out.println(mapper.get("Vincent"));

      mapper.put("Jenny", 24);
      System.out.println(mapper.get("Jenny"));

int sum = 0;
for (Map.Entry<String, Integer> map:mapper.entrySet()){
  sum += map.getValue();
  }
  System.out.println("sum="+sum);

  HashMap<Customer, Integer> ageMap = new HashMap<>();
  ageMap.put(new Customer("John"), 13);
  ageMap.put(new Customer("John"), 17);
  System.out.println(ageMap.get(new Customer("John")));
  System.out.println(ageMap.size());

  HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
  ArrayList<Order> orders = new ArrayList<>();
  orders.add(new Order(100));
  orders.add(new Order(250));
orderMap.put(new Customer("John"), orders);

ArrayList<Order> orders2 = new ArrayList<>();
orders2.add(new Order(1200));
orders2.add(new Order(20));
orders2.add(new Order(88));

orderMap.put(new Customer("Vincent"), orders2);

sum=0;
for (Map.Entry<Customer, ArrayList<Order>> entry:orderMap.entrySet()){
  for (Order o : entry.getValue()){
  sum += o.getAmount();
  }
}
  System.out.println("totalOrderAmount="+sum);

      // values()
      sum = 0;
      for (ArrayList<Order> orderList : orderMap.values()) {
        for (Order o : orderList) {
          sum += o.getAmount();
        }
      }
      System.out.println("totalOrderAmount=" + sum);
  
      // keySet()
      for (Customer customer : orderMap.keySet()) {
          System.out.println("customer=" + customer.getName());
      }

//containskey(), containsValue()
System.out.println(orderMap.containsKey(new Customer("Vincent")));

orderMap.put(new Customer("Sally"),orders);

HashMap<String, ArrayList<Order>> example1 = new HashMap<>();
HashMap<String, ArrayList<Order>> example2 = new HashMap<>();

orderMap.remove(new Customer("Vincent"));
System.out.println(orderMap);
}
  
}
