package com.bootcamp;

import lombok.Value;
import lombok.var;
//resd_only
@Value
public class Person {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person p1 = new Person("Vincent", 5);
    System.out.println(p1.getAge());
    System.out.println(p1.getName());

    Person p2 = new Person("Vincent", 5);
    System.out.println(p1.equals(p2));//true

    System.out.println(p1);
    System.out.println(p2);

    var name = "Vincent";
    // name = 1;
    System.out.println(name);
  }

}
