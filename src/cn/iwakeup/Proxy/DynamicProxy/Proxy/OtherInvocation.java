package cn.iwakeup.Proxy.DynamicProxy.Proxy;

import cn.iwakeup.Proxy.DynamicProxy.Subject.Bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Humin
 * @Date 2018/10/11 19:09
 */
public class OtherInvocation implements InvocationHandler {

    private Bean mPersonBean;
    public OtherInvocation(Bean bean) {
        mPersonBean=bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("get")){
            return method.invoke(mPersonBean,args);
        }else if (method.getName().equals("setStar")){
            return method.invoke(mPersonBean,args);
        }else if (method.getName().startsWith("set")){
            return new IllegalAccessException();
        }
        return null;
    }
}
