package cn.iwakeup.Proxy.RMI.Remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author Humin
 * @Date 2018/10/10 21:14
 */
public interface Service extends Remote  {

    void getState() throws RemoteException;
    void SayHello() throws RemoteException;
}
