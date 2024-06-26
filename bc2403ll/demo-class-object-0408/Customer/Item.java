package Customer;

public class Item {
  private String desc;
  private double price;
  private int quantity;

  public Item(String desc, double price, int quantity) {
    this.desc = desc;
    this.price = price;
    this.quantity = quantity;
  }

// public double subtotal(){
//   return BigDecimal.valueOf(this.price) //
//   .multiply(BigDecimal.valueOf(this.quantity))//
//   .doubleValue();
// }

  public String toString() {
    return "Item[}" //
        + "description=" + this.desc //
        + ", price=" + this.price //
        + ", quantity=" + this.quantity //
        + ")";
  }

  public static void main(String[] args) {
    Item item1 = new Item("APPLE", 4.5, 2);
    Item item2 = new Item("ORANGE", 5.0, 4);
    
    Item[] items = new Item[2];
    items[0] = item1;
    items[1] = item2;

    Order order1 = new Order("V000001", items);
    Order[] orders = new Order[1];
    orders[0] = order1;
    
    Customer c = new Customer("Johnchan", orders);
    System.out.println(c);

    // public Customer(String username, Order[])
  }
}
