package cn.iwakeup.Decorator.INGDecorator;

import cn.iwakeup.Decorator.CoffeeCompent.Drink;

/**
 * @Author Humin
 * @Date 2018 10 03 17:57
 */
public class Soy extends Decorator {



    public Soy(Drink compent) {
        super(compent);
        setDescription("Soy");
        setPrice(1.0f);
    }
}
