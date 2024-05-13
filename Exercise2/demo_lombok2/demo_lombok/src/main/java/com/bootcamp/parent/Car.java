package com.bootcamp.parent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper =true)
public class Car extends Bigcar {
  private String model;

 public Car (String model, double weight){
 super(weight);
  this.model=model;
 }

  public static void main(String[] args) {
    Car car = new Car ("TSLA");
    car.setWeight(10.0);
    System.out.println(car.getWeight());
    System.out.println(car.toString());

    Car car2 = new Car ("TSLA");
    car2.setWeight(10.0);
    System.out.println(car.equals(car2));//true
  }
}
