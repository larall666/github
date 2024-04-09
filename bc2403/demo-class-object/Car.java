public class Car {
  //Attributes
  private String color;
  private double speed;
  private int capacity;
  private boolean isOverSpeed;


//Setter
public void setColor(String color){
  this.color = color;
}

//Getter
public String getColor(){
  return this.color;
}

public void setspeed(double speed){
  this.speed = speed;
  if (speed>90)
  this.isOverSpeed = true;
}

public double getspeed(){
  return this.speed;
}

public void setcapacity (int capacity){
  this.capacity = capacity;
}

public int setcapacity(){
  return this.capacity;
}

public String toString(){
  return "car("
  +"color="+this.color
  +",speed=" +this.speed
  +", capacity="+this.capacity
  +")";
}

public static void main(String[] args) {
  System.out.println("hello");
  Car c = new Car();
  c.setColor("RED");
  c.setspeed(80.0d);
  c.setcapacity(5);
  System.out.println("color="+ c.getColor());
  System.out.println("speed="+ c.getspeed());
  System.out.println("capacity="+ c.setcapacity());
  System.out.println(c.toString());

  

}
}
