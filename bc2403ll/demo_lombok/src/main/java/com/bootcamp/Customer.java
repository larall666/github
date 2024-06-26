package com.bootcamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Customer {
  private String name;
  private List<Order> orders;


  public Customer (String name){
    name= this.name;
    orders=new LinkedList<>();
  }



  public void add(Order order){
    orders.add(order);
  }

  public String getName() {
    return this.name;
  }

  public int orderCount(){
    return this.getOrders().size();
  }

  public boolean isVIP(){
    return this.orderCount() >=10;
  }

  public static int orderCount (Customer customer){
    return customer.orderCount();
  }
  public static void main(String[] args) {
  //    ArrayList<Customer> customers = new ArrayList<>();
  
  // for (Customer c : customers) {
  //   if (c.getName().equals("Vincent")) {

  //   }
  }

}
