package cn.iwakeup.Strategy.Duck;

import cn.iwakeup.Strategy.BrayBehavior.GaGaBray;
import cn.iwakeup.Strategy.FlyBehavior.GoodFly;

/**
 * @Author Humin
 * @Date 2018 09 29 10:52
 */
public class GreenDuck extends Duck {



    @Override
    public void Display() {
        System.out.println("----------IM GREEN----------");
    }

    public GreenDuck() {
        flyBehavior=new GoodFly();
        brayBehavior=new GaGaBray();
    }

}
