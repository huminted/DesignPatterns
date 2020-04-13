package cn.iwakeup.Strategy.Duck;

import cn.iwakeup.Strategy.FlyBehavior.NoFly;
import cn.iwakeup.Strategy.BrayBehavior.GeGeBray;

/**
 * @Author Humin
 * @Date 2018 09 29 10:53
 */
public class RedDuck extends Duck {



    public RedDuck() {
        flyBehavior=new NoFly();
        brayBehavior=new GeGeBray();
    }

    @Override
    public void Display() {
        System.out.println("----------IM RED----------");
    }
}
