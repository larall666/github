package src;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String name;
  private String department;
  private double salary;

  public Employee(String name, String department, double salary){
    this.name=name;
    this.department=department;
    this.salary=salary;
  }
  public static void main(String[] args) {
    List<Employee>emplyees=new ArrayList<>();
    emplyees.add(new Employee("Alice", "HR", 60000));
    emplyees.add(new Employee("Bob", "IT", 45000));
    emplyees.add(new Employee("Carol", "Finance", 75000));
    emplyees.add(new Employee("David", "HR", 48000));

    
  }
}
