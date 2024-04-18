package Building20240417;

public class Building {

  public static String x = "abc";

  private int floor;

  public Building() {
    System.out.println("I'm Building Constructor ...");
  }

  // public Building() {

  // }

  public Building(int floor) {
    this.floor = floor;
  }

  public int getFloor() {
    return this.floor;
  }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  public static String lowerY() {
    return TowerA.y.toLowerCase();
  }
  
  // public void sleep() {
  //   System.out.println("Sleeping ...");
  // }


  public void run() {
    System.out.println("Running ...");
  }

  public static void main(String[] args) {
    Building B = new Building(12); // 
    Building B2 = new Building(8);
    System.out.println(B.getFloor()); // 
    System.out.println(B2.getFloor()); // 
    System.out.println(TowerA.lowerY());
    Building b3 = new Building();

  }

}
