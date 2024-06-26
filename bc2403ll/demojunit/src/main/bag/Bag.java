package com.junit.bag;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Bag {
  public static final String getBall = null;
  private List <Ball> balls;
  public Object getBalls;
  
  public Bag(){
    balls=new LinkedList<>();
  }

  public boolean add(int value, Color color){
    return this.balls.add(Ball.of(value, color));
  }

  // public Ball withdraw(){
  //   int idx = new Random().nextInt(this.balls.size());

  //   return this.balls.remove(idx);//loop
  // }

  public Ball withdraw(){
    if (this.balls.size() <= 0)
    throw new IllegalStateException();
  int idx = new Random().nextInt(this.balls.size());
  return this.balls.remove(idx); // loop
}

  // public int sumOfValues(){
  //   return -1;
  // }

  public int sumOfValues(){
    return this.balls.stream()
    .mapToInt(e->e.getValue())
    .sum();
  }

  public int size(){
    return this.balls.size();
  }
}
