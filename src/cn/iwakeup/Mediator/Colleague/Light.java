package cn.iwakeup.Mediator.Colleague;

import cn.iwakeup.Mediator.Mediator.Mediator;

/**
 * @Author Humin
 * @Date 2018/10/17 16:44
 */
public class Light implements Colleague {

    private String mName;
    private Mediator mMediator;
    public Light(String name,Mediator mediator) {
        this.mName=name;
        this.mMediator=mediator;

    }

    public void sendMessage(int state){
        mMediator.GetMessage(state,mName);
    }

    @Override
    public void Open() {
        System.out.println(mName+"is Open");
    }

    @Override
    public void Off() {
        System.out.println(mName+"is Off");
    }
}
