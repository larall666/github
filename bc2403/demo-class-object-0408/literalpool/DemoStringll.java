//package literalpool
public class DemoStringll {
  public static void main(String[] args) {
    String s = "hello";
    String s2= "hello";

    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode(s2));

    String s3= "hello ";
    System.out.println(System.identityHashCode(s3));
    String s4= new String ("hello");
    System.out.println(System.identityHashCode(s4));
    String s5= String.valueOf("hello");
    System.out.println(System.identityHashCode(s5));

    System.out.println(s2==s5); // true
    String str = "aaa";
    System.out.println(System.identityHashCode(str));
    str = str +"ccc";
    System.out.println(System.identityHashCode(str));

  }
}
