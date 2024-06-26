package src;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue implements Comparator<Integer>{
//   public static void main(String[] args) {
//     Queue<Integer>integers=new PriorityQueue<>();
//     integers.add(12);
//     integers.add(5);
//     integers.add(-2);
//     System.out.println(integers);
//DemoPriorityQueue
//     System.out.println(integers.poll());


//   }

  //class CustomComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
      return a>b?-1:1;
    }

   // public class DemoPriorityQueue{
      public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new DemoPriorityQueue());
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(50);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
      }
    
  
}
