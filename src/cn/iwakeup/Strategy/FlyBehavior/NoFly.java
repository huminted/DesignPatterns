package cn.iwakeup.Strategy.FlyBehavior;

/**
 * @Author Humin
 * @Date 2018 09 29 11:08
 */
public class NoFly implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--NO FLY--");
    }
}
