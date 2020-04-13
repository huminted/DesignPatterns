package cn.iwakeup.Strategy.Duck;

import cn.iwakeup.Strategy.BrayBehavior.BrayBehavior;
import cn.iwakeup.Strategy.FlyBehavior.FlyBehavior;

/**
 * @Author Humin
 * @Date 2018 09 29 10:46
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    BrayBehavior brayBehavior;

    public Duck() {
    }

    public void Swim(){
        System.out.println("--I AM SWIM--");
    }

    public void Bray(){
        brayBehavior.Bray();
    }

    public void Fly(){
        flyBehavior.fly();
    }

    public abstract void Display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setBrayBehavior(BrayBehavior brayBehavior) {
        this.brayBehavior = brayBehavior;
    }
}
