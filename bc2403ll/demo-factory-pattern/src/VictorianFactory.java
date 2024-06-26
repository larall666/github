package src;

public class VictorianFactory implements FurnitureFactory {
  @Override
  public Chair createChair(){
    System.out.println("I have my own way to create Victorian chair");
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa(){
    System.out.println("I have my own way to create Victorian Sofa");
    return new VictorianSofa();
  }
}