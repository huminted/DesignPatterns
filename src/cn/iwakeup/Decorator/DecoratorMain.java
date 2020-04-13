package cn.iwakeup.Decorator;

import cn.iwakeup.Decorator.Coffee.LangBlack;
import cn.iwakeup.Decorator.CoffeeCompent.Drink;
import cn.iwakeup.Decorator.INGDecorator.Milk;
import cn.iwakeup.Decorator.INGDecorator.Soy;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Humin
 * @Date 2018 10 03 17:58
 */
public class DecoratorMain {


    public static void main(String a[]){

        Drink order=new LangBlack();
        System.out.println("Order2: "+ order.getDescription());
        order=new Soy(order);
        System.out.println("Order2: "+ order.getDescription());
        order=new Milk(order);
        System.out.println("Order2: "+ order.getDescription());
        order=new Soy(order);

        System.out.println("Order2: "+ order.getDescription());
        System.out.println("Order2: "+ order.cost());






    }

}
