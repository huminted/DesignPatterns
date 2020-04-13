package cn.iwakeup.Decorator.INGDecorator;

import cn.iwakeup.Decorator.CoffeeCompent.Drink;

/**
 * @Author Humin
 * @Date 2018 10 03 17:56
 */
public class Milk extends Decorator {
    public Milk(Drink compent) {

        super(compent);
        setDescription("Milk");
        setPrice(2.0f);
    }
}
