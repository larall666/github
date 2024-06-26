package Customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  private String orderNo;
  private Item[]items;

  public Order(String orderNo, Item[] items){
    this.orderNo =orderNo;
    this.items = items;
  }

  public double total(){
    BigDecimal total = BigDecimal.valueOf(0.0d);
    for (int i =0;i<items.length;i++){
      total=total.add(BigDecimal.valueOf(items[i].subtotal()));
      
    }
  }

  public String toString() {
    return "Order[" //
        + "orderNo=" + this.orderNo //
        + ", items=" + Arrays.toString(this.items) //
        + "]";
  
  }
}
