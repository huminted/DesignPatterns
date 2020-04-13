package cn.iwakeup.SingleTon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Humin
 * @Date 2018 10 05 11:54
 */
public class SingleTonMain {

  public static void main(String a[]){

        //简单单例模式
//      SingleTon singleTon=SingleTon.getInstance("instance 1");
//      System.out.println(singleTon.getmSingleTonName());
//
//      SingleTon singleTon2=SingleTon.getInstance("instance 233");
//      System.out.println(singleTon2.getmSingleTonName());

      //多线程
      Thread thread=new Thread(new Runnable() {
          @Override
          public void run() {

              SynchronizedSingleton synchronizedSingleton= SynchronizedSingleton.getInstance("SynchronizedSingleton 1");
              System.out.println(synchronizedSingleton.getSynchronizedInstanceName());

          }
      });
      Thread thread2=new Thread(new Runnable() {
          @Override
          public void run() {

              SynchronizedSingleton synchronizedSingleton= SynchronizedSingleton.getInstance("SynchronizedSingleton 2");
              System.out.println(synchronizedSingleton.getSynchronizedInstanceName());

          }
      });




      ExecutorService executorService= Executors.newFixedThreadPool(100);
      executorService.execute(thread);
      executorService.execute(thread2);





  }

}
