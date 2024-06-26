package Company;



import java.math.BigDecimal;
import java.util.Arrays;

public class Order1 {
  private String orderNo;
  private Item1[]items;

  public Order1(String orderNo, Item1[] items){
    this.orderNo =orderNo;
    this.items = items;
  }


  // public String toString() {
  //   return "Order[" //
  //       + "orderNo=" + this.orderNo //
  //       + ", items=" + Arrays.toString(this.items) //
  //       + "]";
  
  // }
}
