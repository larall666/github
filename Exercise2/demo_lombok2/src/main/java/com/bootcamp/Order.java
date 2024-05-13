package com.bootcamp;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;


import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Order {

  private String id;

  // private int amount;

  // // public Order(int amount) {
  // //   this.amount = amount;
  // // }

  // public int getAmount() {
  //   return this.amount;
  // }

  // @Override
  // public String toString() {
  //   return "Order(" //
  //       + "amount=" + this.amount //
  //       + ")";
  // }
}
