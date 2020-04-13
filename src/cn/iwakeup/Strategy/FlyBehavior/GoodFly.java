package cn.iwakeup.Strategy.FlyBehavior;

/**
 * @Author Humin
 * @Date 2018 09 29 11:07
 */
public class GoodFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("——GOOD FLY——");
    }
}
