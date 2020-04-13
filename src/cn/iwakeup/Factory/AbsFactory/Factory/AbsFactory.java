package cn.iwakeup.Factory.AbsFactory.Factory;

import cn.iwakeup.Factory.AbsFactory.Pizza.Pizza;

/**
 * @Author Humin
 * @Date 2018 10 05 10:37
 */
public abstract class AbsFactory {


    public abstract Pizza createPizza(String type);

}
