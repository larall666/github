

import java.util.Arrays;

public class Company {
  private String username;
private Order1[] order;

public Company(String username, Order1[] orders) {
  this.username = username;
  this.order = orders;
}

public String toString() {
  return "Customer(" //
      + "username=" + this.username //
      + ", orders=" + Arrays.toString(this.order) //
      +")";
}
}
