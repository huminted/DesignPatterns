package cn.iwakeup.SingleTon;

/**
 * @Author Humin
 * @Date 2018 10 05 11:47
 */
public class SingleTon {

    private  static SingleTon instance=null;
    public String mSingleTonName;

    private SingleTon(String mSingleTonName) {
        this.mSingleTonName = mSingleTonName;
    }

    public static SingleTon getInstance(String name) {

        if (instance==null){
            instance=new SingleTon( name);
        }
        return instance;
    }

    public String getmSingleTonName() {
        return mSingleTonName;
    }

}
