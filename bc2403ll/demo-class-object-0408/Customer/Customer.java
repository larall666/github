package Customer;

import java.util.Arrays;

public class Customer {
  private String username;
private Order[] order;

public Customer(String username, Order[] orders) {
  this.username = username;
  this.order = orders;
}

// public void add(Order order){
//   Order[] CopyArr = this.order;
//   this.order = new Order[this.order.length+1];
//   int idx=0;
//   for(int i=0;i<)
// }

public String toString() {
  return "Customer(" //
      + "username=" + this.username //
      + ", orders=" + Arrays.toString(this.order) //
      +")";
}
}
