package cn.iwakeup.Proxy.RMI.Remote;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author Humin
 * @Date 2018/10/10 21:24
 */
public class Remote extends UnicastRemoteObject implements Service , Serializable {

    public Remote() throws RemoteException {

    }


    public void getState() {
        System.out.println("远程准备中");
    }


    public void SayHello() {
        System.out.println("远程 Hello");
    }

    public static void main(String a[]) throws RemoteException, MalformedURLException {

        Service service=new Remote();
        LocateRegistry.createRegistry(90);
        Naming.rebind("hello",service);

    }


}
