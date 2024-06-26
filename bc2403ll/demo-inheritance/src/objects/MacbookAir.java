package src.objects;

import java.util.Arrays;
import java.util.Objects;
import src.Color;

public class MacbookAir {
  private double inch;
  private double cpu;
  private double ram;
  private double disk;
  private Color color;

  public MacbookAir(double inch, double cpu, double ram, double disk, Color color){
    this.inch=inch;
    this.cpu=cpu;
    this.ram=ram;
    this.disk=disk;
    this.color=color;
  }

  public String toString() {
    return "MacbookAir(" //
        + "inch=" + this.inch //
        + "cpu=" + this.cpu //
        + "ram=" + this.ram //
        + "disk=" + this.disk //
        + ", color=" + this.color //
        +")";
  }

  public double getInch(){
    return this.inch;
  }

  public double getCpu(){
    return this.cpu;
  }

  public double getRam(){
    return this.ram;
  }

  public double getDisk(){
    return this.disk;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object obj){
    if (this==obj)
    return true;
    if (!(obj instanceof MacbookAir))
    return false;
    MacbookAir M=(MacbookAir) obj;
    // return this.inch == M.getInch()//
    // && this.cpu == M.getCpu()//
    // && this.ram == M.getRam()//
    // && this.disk == M.getDisk()//
    // && this.color == M.getColor();
    return Objects.equals(this.inch, M.getInch())
    &&  Objects.equals(this.cpu, M.getCpu())
    &&  Objects.equals(this.ram, M.getRam())
    &&  Objects.equals(this.disk, M.getDisk())
    &&  Objects.equals(this.color, M.getColor());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.inch, this.cpu,this.ram,this.disk,this.color );
  }


  public static void main(String[] args) {
    MacbookAir M1 = new MacbookAir(15, 3,32,512,Color.BLACK);
    MacbookAir M2 = new MacbookAir(15, 3,32,512,Color.BLACK);
    System.out.println(M1==M2);
    System.out.println(M1.equals(M2));

    System.out.println(M1.hashCode());
    System.out.println(M2.hashCode());

    System.out.println(System.identityHashCode(M1));
    System.out.println(System.identityHashCode(M2));

    //Sorting
    int[] arr = new int [] {10,5,2,4};
    Arrays.sort(arr);//
    System.out.println(Arrays.toString(arr));

    MacbookAir [] arr2 = new MacbookAir[]{new MacbookAir(0, 0, 0, 0, null),
    new MacbookAir(0, 0, 0, 0, null)};

    System.out.println(M1);

  }
}
