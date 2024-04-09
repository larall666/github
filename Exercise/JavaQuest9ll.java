package questions;

/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9ll {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    char reuslt = str.charAt(15);
    System.out.println(reuslt);

    // prints e (the 1st e)
    // code here ...
    char reuslt2 = str.charAt(1);
    System.out.println(reuslt2);
    // Use indexOf()
    // prints 3
    System.out.println(str.indexOf('t'));
    // prints 9
    System.out.println(str.indexOf('x'));
    // prints 10
    // code here ...
    System.out.println(str.indexOf('L'));
    // Use String trim()
    String abc = "    ab c    ";
    
    // prints "ab c"
    System.out.println(abc.trim());
    // Use String replace() method

    // prints VenturenixLAB, Coding
    String after = str.replace("Java", "Coding");
    System.out.println(after);
    // code here ...

    // int length()
    // prints 19
    // code here ...
    int length = str.length();
System.out.println(length);

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    String result = str.substring(5, 8); // hel
    System.out.println(result);

    // print "VENTURENIXLAB, JAVA"
    System.out.println(str.toUpperCase());
    
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.toLowerCase());
    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
   String after1 = str.replace("e", "*").toUpperCase();
    System.out.println(after1+"!!!");
    
  }
}