package cn.iwakeup.Observer.Observer;

/**
 * @Author Humin
 * @Date 2018 09 30 12:35
 */
public class ForcastCondition implements Observer {

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
        System.out.println("Tomorrow mTempture"+(mTempture+Math.random()));
        System.out.println("Tomorrow mPressure"+(mPressure+Math.random()));
        System.out.println("Tomorrow mHuminity"+(mHuminity+Math.random()));
    }


}
