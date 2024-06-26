package src.buildin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  public static void main(String[] args) {
    Function<String, Integer> function=s->s.length();
    System.out.println(function.apply("hello"));

    BiFunction<String, String, Integer> totalLength=(s1,s2)->s1.length()+s2.length();
    System.out.println(totalLength.apply("hellou", "cba"));

    Map<String, Integer>nameLengthMap=new HashMap<>();
    nameLengthMap.put("John","John".length());
    nameLengthMap.put("She",2);

    Function<String, Integer>nameLength=s->s.length();
    nameLengthMap.computeIfAbsent("Vincent", nameLength);
    nameLengthMap.computeIfAbsent("larala", s->s.length()/2);
    nameLengthMap.computeIfAbsent("Oscar", s->s.length()+1);
    System.out.println(nameLengthMap);

    //merge()
    System.out.println(nameLengthMap.merge("Oscar", 7,(n,o)->n*o));//5*7=35
    
  }
}
