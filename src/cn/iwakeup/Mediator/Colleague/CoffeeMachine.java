package cn.iwakeup.Mediator.Colleague;

import cn.iwakeup.Mediator.Mediator.Mediator;

/**
 * @Author Humin
 * @Date 2018/10/17 16:55
 */
public class CoffeeMachine implements Colleague {

    private String mName;
    private Mediator mMediator;

    public CoffeeMachine(String name, Mediator mediator) {
        mName = name;
        mMediator = mediator;
    }

    @Override
    public void Open() {
        System.out.println(mName+"is Open");
    }

    @Override
    public void Off() {
        System.out.println(mName+"is Open");
    }

    @Override
    public void sendMessage(int state) {
        mMediator.GetMessage(state,mName);
    }
}
