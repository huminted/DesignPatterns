package cn.iwakeup.Adapter.ClassAdapter.Adapter;

import cn.iwakeup.Adapter.ClassAdapter.AdapteTarget.RedTurkey;
import cn.iwakeup.Adapter.ClassAdapter.AdapteTarget.Turkey;
import cn.iwakeup.Adapter.ClassAdapter.Target.Duck;

/**
 * @Author Humin
 * @Date 2018 10 06 13:36
 */
public class TurkeyAdapter  extends RedTurkey implements Duck {


    @Override
    public void Bray() {
        super.gobble();
    }

    @Override
    public void Fly() {
        super.fly();
    }
}
