package cn.iwakeup.Factory.SimpleFactory;

import cn.iwakeup.Factory.SimpleFactory.Factory.SimpleFactory;
import cn.iwakeup.Factory.SimpleFactory.Pizza.Pizza;

import java.util.Scanner;

/**
 * @Author Humin
 * @Date 2018 10 05 10:39
 */
public class OrderPizza {

    public OrderPizza(SimpleFactory simpleFactory) {

        String pizzaType=getPizzaType();

        Pizza pizza=simpleFactory.createPizza(pizzaType);
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
