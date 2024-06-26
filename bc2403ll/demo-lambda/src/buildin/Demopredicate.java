package src.buildin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Demopredicate {
  public static void main(String[] args) {
    int age=18;
    boolean isElderly=age>65;
    Predicate<Integer>isElderly2 = age2->age2>65;
    System.out.println(isElderly2.test(66));//true
    System.out.println(isElderly2.test(65));//false

    BiPredicate<String, Integer> isCharacterS =
    (str, idx) -> str.charAt(idx) == 'S';
    

    BiPredicate<String, String>startsWith=(s1,s2)->s1.startsWith(s2);
    System.out.println(startsWith.test("hello", "he"));//true
    
    BiPredicate<String, String>endsWith=(s1,s2)->s1.endsWith(s2);
    System.out.println(startsWith.test("hello", "lo"));//false

    BiPredicate<String, String>combined=startsWith.or(endsWith);
    System.out.println(combined.test("hello", "lo"));//true
    System.out.println(combined.test("lello", "lo"));//true
    
    BiPredicate<String, Integer>lengthLatgerThan=
    (s1,length)->s1.length()>length;
    System.out.println(lengthLatgerThan.test("hello", 4));//true


  }
  public static boolean isCharacterS(String s, Integer idx){
    return s.charAt(idx)=='S';
  
}
}
