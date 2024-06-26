package src;

public class App {
    public static void main(String[] args) throws Exception {
        Task task =new Task();
        Runnable task2= ()->{
System.out.println("I'm task2, and running...");
        };

        Thread th1=new Thread(task);
        th1.start();

        Thread th2=new Thread(task2);
        th2.start();

        System.out.println("main ends...");
    }
}
