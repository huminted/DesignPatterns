package cn.iwakeup.Factory.AbsFactory.Factory;

import cn.iwakeup.Factory.AbsFactory.Pizza.*;

/**
 * @Author Humin
 * @Date 2018 10 05 11:16
 */
public class LDFactory extends AbsFactory {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza=null;
        if (type.equals("ChinesePizza")){
            pizza=new LDChinesePizza();
        }else if (type.equals("ChressPizza")){
            pizza=new LDChressPizza();
        }else if (type.equals("FruitPizza")){
            pizza=new LDFruitPizza();

        }


        return pizza;

    }
}
