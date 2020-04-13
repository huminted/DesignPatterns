package cn.iwakeup.Factory.FactoryMethod.Factory;

import cn.iwakeup.Factory.FactoryMethod.Pizza.ChinesePizza;
import cn.iwakeup.Factory.FactoryMethod.Pizza.ChressPizza;
import cn.iwakeup.Factory.FactoryMethod.Pizza.FruitPizza;
import cn.iwakeup.Factory.FactoryMethod.Pizza.Pizza;

/**
 * @Author Humin
 * @Date 2018 10 05 10:37
 */
public class SimpleFactory {


    public Pizza createPizza(String type){
        Pizza pizza=null;
        if (type.equals("ChinesePizza")){
            pizza=new ChinesePizza();
        }else if (type.equals("ChressPizza")){
            pizza=new ChressPizza();
        }else if (type.equals("FruitPizza")){
            pizza=new FruitPizza();
        }


        return pizza;
    }

}
