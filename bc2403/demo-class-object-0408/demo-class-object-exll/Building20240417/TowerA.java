package Building20240417;

public class TowerA extends Building{

  public static String A = "aEF";

  public static String y = "DEF";

  private String flat;
  
  public void TowerA (String flat){
    this.flat=flat;
  }

  public TowerA(String flat, int Floor) {
    super();
    this.flat=flat;
  }




  public String getFlat(){
    return this.flat;
  }

  public void setFlatcounte(String flat){
    this.flat=flat;
  }

  // public int getFloor() {
  //   return this.floor;
  // }

  public String upperX() {
    return Building.x.toUpperCase();
  }

  public String upperA() {
    return A.toUpperCase();
  }

 // @Override
  public void sleep() {
    System.out.println("at home...");
  }
  
  public static void main(String[] args) {
    TowerA towerA = new TowerA("A-F", 8);
    towerA.setFloor(12);
   
    System.out.println(towerA.getFloor()); 
   //towerA.setFloor(5);
    System.out.println(towerA.getFlat());

    System.out.println(towerA.upperX());
    System.out.println(towerA.upperA());

    towerA.sleep();
    towerA.run();
  }

  
}




