package cn.iwakeup.Adapter.ObjectAdapter.Adapter;

import cn.iwakeup.Adapter.ObjectAdapter.AdapteTarget.Turkey;
import cn.iwakeup.Adapter.ObjectAdapter.Target.Duck;

/**
 * @Author Humin
 * @Date 2018/10/06 13:36
 */
public class TurkeyAdapter implements Duck {

    private Turkey mTurkey;
    public TurkeyAdapter(Turkey turkey) {
        this.mTurkey=turkey;
    }

    @Override
    public void Bray() {
        mTurkey.gobble();

    }

    @Override
    public void Fly() {
        mTurkey.fly();

    }
}
