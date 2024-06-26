package src;

import java.util.LinkedList;
import java.util.Queue;

public class BootcampQueue<T> {
  private Queue<T> data;

  public BootcampQueue(){
    this.data = new LinkedList<>();
  }

  //add
  public void add(T s){
    this.data.add(s);
  }

  //poll
  public T poll(){
    return this.data.poll();
  }
}
