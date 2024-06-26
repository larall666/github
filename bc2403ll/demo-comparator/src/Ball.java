package src;

import java.security.PublicKey;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;
  private double size;
  public Ball(Color color, double size){
    this.color=color;
    this.size= size;
  }
  public double getSize(){
  return this.size;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public int compareTo(Ball b){
    // return this.color==Color.BLACK?-1:1;
     
// return this.size>b.getSize()?-1:1;
if (this.color==Color.YELLOW)
return-1;
if(this.color.name().charAt(0)>b.getColor().name().charAt(0))
return  -1;
else if (this.color.name().charAt(0)<b.getColor().name().charAt(0))
return 1;
return this.size>b.getSize()?-1:1;
  }

  // @Override
  public String toString(){
    return"Ball("//
    +"size="+this.size//
    +", color="+this.color//
    +")";
  }

public static void main(String[] args) {
  List<Ball>balls=new LinkedList<>();
  balls.add(new Ball(Color.BLACK, 10.3));
  balls.add(new Ball(Color.YELLOW, 7.0d));
  balls.add(new Ball(Color.YELLOW, 3.2d));
  balls.add(new Ball(Color.RED, 6.2d));
  Collections.sort(balls);
  System.out.println(balls);
}
}
