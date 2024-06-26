package src;

public class DemoSynclock {
  private static int x =17;
private final Object lock=new Object();
  public static void addOne(){
    int score=100;

    synchronized(lock){
      x++;
    }
    int result = (int) Math.pow(score++,2);
  }
  public static void main(String[] args) {
    DemoSynclock dsl = new DemoSynclock();
    Runnable task=()->{
      for(int i=0;i<1_000_000;i++){
        dsl.addOne();
      }
    };
    Thread th1=new Thread(task);
    Thread th2=new Thread(task);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    }catch(InterruptedException e){

    }
    System.out.println(object.count);
  
  }
}
