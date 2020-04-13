package cn.iwakeup.Adapter.ObjectAdapter.AdapteTarget;

/**
 * @Author Humin
 * @Date 2018 10 06 13:42
 */
public class RedTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("--GOGOGO--");
    }

    @Override
    public void fly() {
        System.out.println("--Im Flying Short--");
    }
}
