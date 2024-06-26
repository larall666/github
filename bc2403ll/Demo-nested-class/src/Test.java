package src;

public class Test {
  public static void main(String[] args)  {
    Outer.StaticNested o2=new Outer.StaticNested();
o2.print();

Outer o3=new Outer();
Outer.Inner o4 = o3.new Inner();
o4.print();
  }
}
