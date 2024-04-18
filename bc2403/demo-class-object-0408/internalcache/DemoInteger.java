public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1 == i2); //true
    System.out.println(System.identityHashCode(i1));
    System.out.println(System.identityHashCode(i2));

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3 == i4); //false
    System.out.println(System.identityHashCode(i3));
    System.out.println(System.identityHashCode(i4));

    Float F1 = Float.valueOf(127.0f);
    Float F2 = Float.valueOf(127.0f);
    System.out.println(F1 == F2); //false

    Character c1 = Character.valueOf('$');
    Character c2 = Character.valueOf('$');
    System.out.println(c1 == c2); //true

    Character c3 = Character.valueOf('為');
    Character c4 = Character.valueOf('為');
    System.out.println(c3 == c4); //false
  }
}
