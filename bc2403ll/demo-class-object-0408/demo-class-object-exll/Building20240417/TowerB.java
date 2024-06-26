package Building20240417;

public class TowerB extends Building{

  public String upperX() {
    return Building.x.toUpperCase();
  }

  public static void main(String[] args) {
    TowerB tb = new TowerB();
    tb.setFloor(9);
    System.out.println(tb.getFloor());
    System.out.println(tb.upperX());
  }
}
