package src;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
  //HashTable->Thread-safe
   public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // 在多个线程中同时修改哈希表
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                hashtable.put(Thread.currentThread().getName(), i);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出哈希表的内容
        System.out.println(hashtable);

        //HashMap-> non Thread-safe
         Map<String, Integer> hashMap = Collections.synchronizedMap(new HashMap<>());

        // 在多个线程中同时修改哈希表
        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (hashMap) {
                    hashMap.put(Thread.currentThread().getName(), i);
                }
            }
        };

        Thread thread5 = new Thread(runnable1);
        Thread thread6 = new Thread(runnable1);

        thread5.start();
        thread6.start();

        try {
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出哈希表的内容
        System.out.println(hashMap);
    }
}
  

