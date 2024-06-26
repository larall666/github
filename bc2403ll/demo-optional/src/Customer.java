package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer {
  private Optional<String>name;
  public Optional<String> getName(){
    return this.name;
  }
  //deserialization/serialization序列化

  public static void main(String[] args) {
  sum(null, Optional.of(Double.valueOf(3.0)));

  Optional <String>result =null;
  result=Optional.of("hello");
  result=Optional.empty();

  List<String> names = new ArrayList<>(List.of("Vincent","Jenny","Oscar"));
  List<Optional<String>>result2=names.stream()
  .map(e->Optional.ofNullable(e))
  .collect(Collectors.toList());
  System.out.println(result2);
  
  }


  
  public static Double sum(Optional<Double> d1, Optional <Double> d2){
    if (d1!=null && d2!=null&&d1.isPresent()&&d2.isPresent()){
      return d1.get().doubleValue()+d2.get().doubleValue();
    }
    throw new IllegalArgumentException();
  }



}