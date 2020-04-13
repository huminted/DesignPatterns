package cn.iwakeup.Mediator.Colleague;

import cn.iwakeup.Mediator.Mediator.Mediator;

/**
 * @Author Humin
 * @Date 2018/10/17 16:51
 */
public class Alarm implements Colleague {

    private String mName;
    private Mediator mMediator;

    public Alarm(String name, Mediator mediator) {
        mName = name;
        mMediator = mediator;
    }

    @Override
    public void Open() {
        System.out.println(mName+"is Open");
    }

    @Override
    public void Off() {
        System.out.println(mName+"is Off");
    }

    @Override
    public void sendMessage(int state) {
        mMediator.GetMessage(state,mName);
    }
}
