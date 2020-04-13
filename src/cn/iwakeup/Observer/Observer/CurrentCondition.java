package cn.iwakeup.Observer.Observer;

/**
 * @Author Humin
 * @Date 2018 09 30 12:35
 */
public class CurrentCondition implements Observer {

    private float mTempture;
    private float mPressure;
    private float mHuminity;

    @Override
    public void update(float tempture, float pressure, float huminity) {
        this.mTempture=tempture;
        this.mPressure=pressure;
        this.mHuminity=huminity;
        display();
    }

    private void display(){
        System.out.println("Today mTempture"+mTempture);
        System.out.println("Today mPressure"+mPressure);
        System.out.println("Today mHuminity"+mHuminity);
    }
}
