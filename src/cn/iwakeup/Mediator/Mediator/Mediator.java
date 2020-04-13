package cn.iwakeup.Mediator.Mediator;

import cn.iwakeup.Mediator.Colleague.Colleague;

/**
 * @Author Humin
 * @Date 2018/10/17 16:39
 */
public abstract class Mediator {

    public abstract void Register(String ColleagueName, Colleague colleague);

    public abstract void GetMessage(int message,String ColleagueName);

    public abstract void SendMessage();

}
