package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@NonNull
public class Student {
  @Getter
  @NonNull
  private String name;
private int age;
  public static void main(String[] args) {
    Student s1 = new Student("Vincent",4);
System.out.println(s1.getName());
s1.setAge(5);
System.out.println(s1);

Student s2 = new Student("Vincent");
System.out.println(s2);
  }
}
