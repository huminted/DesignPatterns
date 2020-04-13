package cn.iwakeup.Factory.FactoryMethod.OrderPizza;

import cn.iwakeup.Factory.FactoryMethod.Pizza.LDChinesePizza;
import cn.iwakeup.Factory.FactoryMethod.Pizza.LDChressPizza;
import cn.iwakeup.Factory.FactoryMethod.Pizza.LDFruitPizza;
import cn.iwakeup.Factory.FactoryMethod.Pizza.Pizza;


/**
 * @Author Humin
 * @Date 2018 10 05 11:38
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String pizzaType) {
        String type= pizzaType;
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
