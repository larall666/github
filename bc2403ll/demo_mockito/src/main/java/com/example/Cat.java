package com.example;

public class Cat {
  // private int x;
  // private int y;

public int sum(int x, int y){
return x+y;
}

public int subtract(int x, int y){
  return x-y;
  }

  // public int sum(){
  //   return this.x+this.y;
    
  // }
  public static void main(String[] args) {
    //Cat cat = new Cat(1, 3);
    Cat cat2 = new Cat();
    // System.out.println(cat.sum()); // 4
    System.out.println(cat2.sum(1, 10));
    System.out.println(new Cat().sum(8, 10)); // 18
    System.out.println(new Cat().sum(9, 10)); // 18
  }
}
