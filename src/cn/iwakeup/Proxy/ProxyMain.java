package cn.iwakeup.Proxy;

import cn.iwakeup.Proxy.DynamicProxy.MatchService;
import cn.iwakeup.Proxy.RMI.Monitor.Monitor;
import cn.iwakeup.Proxy.RMI.Remote.Service;
import cn.iwakeup.Proxy.RMI.Proxy.ServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author Humin
 * @Date 2018/10/10 21:14
 */
public class ProxyMain {

    public static void main(String a[]) throws RemoteException {

        //Rmi
//        Service local=new ServiceImpl();
//        Service remote = null;
//        try {
//             remote= (Service) Naming.lookup("rmi/127.0.0.1:1020/hello");
//        } catch (NotBoundException | MalformedURLException | RemoteException e) {
//            e.printStackTrace();
//        }
//        Monitor monitor=new Monitor(remote);
//        monitor.printStat();
//        monitor.SayHello();

        //动态代理和保护代理
        MatchService matchService=new MatchService();

    }

}
