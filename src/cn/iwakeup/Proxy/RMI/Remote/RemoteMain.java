package cn.iwakeup.Proxy.RMI.Remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author Humin
 * @Date 2018/10/10 21:30
 */
public class RemoteMain {
    public static void main(String a[]){
        try {
            Service remote=new Remote();
            LocateRegistry.createRegistry(2020);

            Naming.rebind("hello",remote);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
