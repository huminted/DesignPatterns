package cn.iwakeup.Proxy.DynamicProxy;

import cn.iwakeup.Proxy.DynamicProxy.Proxy.OtherInvocation;
import cn.iwakeup.Proxy.DynamicProxy.Proxy.OwnerInvocation;
import cn.iwakeup.Proxy.DynamicProxy.Subject.Bean;
import cn.iwakeup.Proxy.DynamicProxy.Subject.PersonBeanImp;

import java.lang.reflect.Proxy;


/**
 * @Author Humin
 * @Date 2018/10/11 19:15
 */
public class MatchService {

    public MatchService() {

        Bean person=new PersonBeanImp("Humin","Men");
        Bean OwnerProxy=getOwnerProxy(person);
        OwnerProxy.setStar(200);

        System.out.println("OwnerProxy:"+OwnerProxy.getName()+" "+OwnerProxy.getSex()+" "+OwnerProxy.getStar());

        Bean OtherProxy=getOtherProxy(person);
        OtherProxy.setStar(10);
        OtherProxy.setName("Zengrui");
        OtherProxy.setSex("Men");

        System.out.println("OtherProxy:"+OtherProxy.getName()+" "+OtherProxy.getSex()+" "+OtherProxy.getStar());




    }



    private Bean getOwnerProxy(Bean bean){
        return (Bean) Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),new OwnerInvocation(bean));
    }

    private Bean getOtherProxy(Bean bean){
        return (Bean) Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),new OtherInvocation(bean));
    }
}

