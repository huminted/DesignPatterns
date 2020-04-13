package cn.iwakeup.Factory.FactoryMethod.OrderPizza;

import cn.iwakeup.Factory.FactoryMethod.Factory.SimpleFactory;
import cn.iwakeup.Factory.FactoryMethod.Pizza.Pizza;

import java.util.Scanner;

/**
 * @Author Humin
 * @Date 2018 10 05 10:39
 */
public abstract class OrderPizza {

    public OrderPizza( ) {

        String pizzaType=getPizzaType();

        Pizza pizza=createPizza(pizzaType);
        if (pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

    }

    public abstract Pizza createPizza(String  pizzaType);




    private static String getPizzaType(){

        Scanner scanner=new Scanner(System.in);
        return  scanner.nextLine();
    }
}
