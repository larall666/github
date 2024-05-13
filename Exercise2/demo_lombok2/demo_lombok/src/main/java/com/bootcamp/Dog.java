package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Amotations
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Dog {
  private String name;
  private int age;


  public static void main(String[] args) {
    Dog dog = new Dog("Vincent",3);
    dog.setAge(10);
    dog.setAge(12);
    System.err.println(dog.getAge());
  }
}
