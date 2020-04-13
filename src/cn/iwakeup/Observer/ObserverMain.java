package cn.iwakeup.Observer;

import cn.iwakeup.Observer.Observer.CurrentCondition;
import cn.iwakeup.Observer.Observer.ForcastCondition;
import cn.iwakeup.Observer.Subject.WeatherData;

/**
 * @Author Humin
 * @Date 2018 09 30 12:47
 */
public class ObserverMain  {

    public static void main(String a[]){

        WeatherData weatherData=new WeatherData();
        CurrentCondition currentCondition=new CurrentCondition();
        ForcastCondition forcastCondition=new ForcastCondition();

        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(forcastCondition);
        weatherData.setData(20,30,60);

        weatherData.removeObserver(forcastCondition);
        weatherData.setData(30,40,90);


    }
}
