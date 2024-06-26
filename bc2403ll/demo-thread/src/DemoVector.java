package src;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  static List <Charactor> charactors =new LinkedList<>();
  static List<Charactor> charactors2 =new Vector<>();

  Runnable concatLinkedList=()->{
    for(int i=0;i<1_000_000;i++){
      charactors.add('s');
    }
  };
Thread th1=new (concatLinkedList);
Thread th2=new (concatLinkedList);
th1.start();
th2.start();

try{
  th1.join();
  th2.join();
}catch(InterruptedException e){

}
System.out.println(charactors.size);
}
