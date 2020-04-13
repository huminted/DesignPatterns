package cn.iwakeup.Observer.Subject;

import cn.iwakeup.Observer.Observer.Observer;

import java.util.ArrayList;

/**
 * @Author Humin
 * @Date 2018 09 30 12:34
 */
public class WeatherData  implements  Subject{

    private float Tempture;
    private float Pressure;
    private float Huminity;
    private ArrayList<Observer> observers=new ArrayList<>();

    public void  setData(float T,float P ,float H){
        this.Tempture=T;
        this.Pressure=P;
        this.Huminity=H;
        dataChange();

    }



    public WeatherData() {

    }

    public float getTempture() {
        return Tempture;
    }

    public float getPressure() {
        return Pressure;
    }

    public float getHuminity() {
        return Huminity;
    }



    public void dataChange(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(getTempture(), getPressure(), getHuminity());
        }

    }
}
