package cn.iwakeup.SingleTon;

/**
 * @Author Humin
 * @Date 2018 10 05 11:49
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance=null;

    private static String SynchronizedInstanceName;

    private SynchronizedSingleton(String name) {
        this.SynchronizedInstanceName=name;
    }

     static synchronized SynchronizedSingleton getInstance(String name) {
        if (instance==null){
            instance=  new SynchronizedSingleton( name);
        }
        return instance;
    }

    public  String getSynchronizedInstanceName() {
        return SynchronizedInstanceName;
    }
}
