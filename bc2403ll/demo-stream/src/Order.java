package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Order {
  private int orderId;
  private int customerId;
  private double amount;
  private LocalDate orderDate;

  public Order(int orderId, int customerId, double amount,LocalDate orderDate) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.amount = amount;
    this.orderDate = orderDate;
  }

  public int getOrderId() {
    return this.orderId;
  }

  public int getCustomerId() {
    return this.customerId;
  }

  public double getAmount() {
    return this.amount;
  }

  public LocalDate getOrderDate() {
    return this.orderDate;
  }
  public static void main(String[] args) {
    List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 101, 800, LocalDate.of(2023, 4, 15)));
        orders.add(new Order(2, 102, 1200, LocalDate.of(2023, 4, 20)));
        orders.add(new Order(3, 101, 1500, LocalDate.of(2023, 4, 25)));
        orders.add(new Order(4, 103, 900, LocalDate.of(2023, 4, 18)));
        orders.add(new Order(5, 102, 1100, LocalDate.of(2023, 4, 22)));
        orders.add(new Order(6, 101, 850, LocalDate.of(2023, 4, 15)));

        Map<Integer,Double> result = orders.stream() //
        .filter(e -> e.getAmount() < 1100) //
        .sorted((p1,p2)->p1.getOrderDate().isAfter(p2.getOrderDate())?-1:1)
        .collect(Collectors.groupingBy(e->e.getCustomerId(),
        Collectors.averagingDouble(e->e.getAmount())));
System.out.println(result);

Map<Integer,Double> result2 = orders.stream() //
        .collect(Collectors.groupingBy(Order::getCustomerId,
        Collectors.summingDouble(Order::getAmount)))
        .ertrySet().stream()
.filter(entry->entry.getValue()>1100)
.filter(order->order.getCustomerId()==entry.getKey())
.collect(Collectors)
System.out.println(result2);

  }
      }

