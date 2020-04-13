package cn.iwakeup.Factory;

import cn.iwakeup.Factory.AbsFactory.Factory.LDFactory;
import cn.iwakeup.Factory.AbsFactory.OrderPizza;
import cn.iwakeup.Factory.FactoryMethod.OrderPizza.LDOrderPizza;


/**
 * @Author Humin
 * @Date 2018 10 05 10:37
 */
public class FactoryMain {


    public static void main(String a[]){
        //简单工厂
        //OrderPizza orderPizza=new OrderPizza(new AbsFactory());

        //工厂方法
        LDOrderPizza orderPizza=new LDOrderPizza();

        //抽象工厂
        //OrderPizza orderPizza=new OrderPizza(new LDFactory());



    }


}
