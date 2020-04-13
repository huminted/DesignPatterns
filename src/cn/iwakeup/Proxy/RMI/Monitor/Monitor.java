package cn.iwakeup.Proxy.RMI.Monitor;

import cn.iwakeup.Proxy.RMI.Remote.Service;

import java.rmi.RemoteException;

/**
 * @Author Humin
 * @Date 2018/10/10 21:17
 */
public class Monitor {

    private Service mService;
    public Monitor(Service service) {
        mService=service;
    }

    public void printStat() throws RemoteException {
            mService.getState();

    }

    public void SayHello() throws RemoteException {
        mService.SayHello();
    }

}
