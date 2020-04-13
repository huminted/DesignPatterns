package cn.iwakeup.Proxy.DynamicProxy.Proxy;

import cn.iwakeup.Proxy.DynamicProxy.Subject.Bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Humin
 * @Date 2018/10/11 18:57
 */
public class OwnerInvocation implements InvocationHandler {
    private Bean mPersonBean;
    public OwnerInvocation(Bean personBean) {
        mPersonBean=personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("get"))
        {
            return method.invoke(mPersonBean,args);
        }else if (method.getName().equals("setStar")){
            return new RuntimeException("超出权限");
        }else if (method.getName().startsWith("set")){
            return method.invoke(mPersonBean,args);
        }
        return null;
    }
}
