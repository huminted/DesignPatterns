package cn.iwakeup.Adapter.ObjectAdapter.Target;

/**
 * @Author Humin
 * @Date 2018 10 06 13:41
 */
public class RedDuck implements Duck {
    @Override
    public void Bray() {
        System.out.println("--GAGA--");
    }

    @Override
    public void Fly() {
        System.out.println("--Im Flying--");
    }
}
