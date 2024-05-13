package com.bootcamp;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Getter
@Setter
public class Staff {

  private String name;
  private LocalDate joinDate;
  


  //  // Static Final Variable (Class Constant, belongs to class)
  //  public static final double PI = 3.14159;

  //  // Final Variable (Object Constant, belongs to object)
  //  private final int HOURS_OF_DAY = 24;
 
  //  // Instance Variable

  //  private double salary;
 
  //  // Static Variable
  //  private static int ageLimit; // 0
 
  //  // Constructor
  //  private Staff(String name) {
  //    this.name = name;
  //  }
 
  //  // Instance Method
  //  public double getSalary() {
  //    return this.salary;
  //  }
 
  //  // Instance Method
  //  public double getHoursOfDay() {
  //    return this.HOURS_OF_DAY;
  //  }
 
  //  // Static method
  //  public static int getAgeLimit() {
  //    return ageLimit;
  //  }
 
  //  // Static Method
  //  public static Staff of(String name) {
  //    return new Staff(name);
  //  }
 
  //  // Static method
  //  public static Staff peter() {
  //    return new Staff("Peter");
  //  }
 

  //  public String toString() {
  //   return "Staff(" //
  //       + "name=" + this.name //
  //       + ", ageLimit=" + this.ageLimit //
  
  //       + ")";
  // }
  //  public static void main(String[] args) {
  //    Staff.ageLimit = 10; // write
  //    System.out.println(Staff.ageLimit); // 10 (read)
  //    Staff.ageLimit = 12; // write
 
  //    Staff s1 = Staff.of("Vincent");
  //    System.out.println(s1.ageLimit); // 12 with warning
 
  //    // Object can access static variable (Not suppose to use this way)
  //    // Static method cannot access instance variable
 
  //    // Final Instance Variable
  //    System.out.println(s1.getHoursOfDay());
  //    Staff s2 = Staff.of("Jenny");
  //    System.out.println(s2.HOURS_OF_DAY);

  //    System.out.println(s1);
  //  }
}
