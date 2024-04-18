package Bigdecimal;

import java.math.BigDecimal;

public class DemoDouble {
  public static void main(String[] args) {
    double result = 0.1d + 0.2d;
    System.out.println(result);

    BigDecimal bd1=new BigDecimal("0.1");
    BigDecimal bd2=bd1.add(new BigDecimal("0.2"));
    System.out.println(bd2.doubleValue());

    double d1 = 
    BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println("d1="+d1);
  }
}
