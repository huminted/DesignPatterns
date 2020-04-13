package cn.iwakeup.Proxy.RMI.Proxy;

import cn.iwakeup.Proxy.RMI.Remote.Service;

/**
 * @Author Humin
 * @Date 2018/10/10 21:16
 */
public class ServiceImpl implements Service {


    @Override
    public void getState() {
        System.out.println("本地准备中");
    }

    @Override
    public void SayHello() {
        System.out.println("本地 Hello");
    }
}
