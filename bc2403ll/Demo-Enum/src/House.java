package src;

public class House {
private Direction1 direction;

public House(Direction1 direction) {
  this.direction = direction;
}


public void setDirection(Direction1 direction) {
  this.direction = direction;
}

public Direction1 getDirection(){
  return this.direction;
}
public static void main(String[] args) throws Exception {
  House house = new House(Direction1.EAST);
  house.setDirection(Direction1.NORTH);

  System.out.println(house.getDirection() == Direction1.EAST);

}

}
