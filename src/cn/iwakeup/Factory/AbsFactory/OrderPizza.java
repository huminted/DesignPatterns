package cn.iwakeup.Factory.AbsFactory;

import cn.iwakeup.Factory.AbsFactory.Factory.AbsFactory;
import cn.iwakeup.Factory.AbsFactory.Pizza.Pizza;

import java.util.Scanner;

/**
 * @Author Humin
 * @Date 2018 10 05 10:39
 */
public class OrderPizza {

    public OrderPizza(AbsFactory absFactory) {

        String pizzaType=getPizzaType();

        Pizza pizza=absFactory.createPizza(pizzaType);
        if (pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

    }




    private static String getPizzaType(){

        Scanner scanner=new Scanner(System.in);
        return  scanner.nextLine();
    }
}
