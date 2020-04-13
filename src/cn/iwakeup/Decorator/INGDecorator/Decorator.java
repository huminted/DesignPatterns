package cn.iwakeup.Decorator.INGDecorator;

import cn.iwakeup.Decorator.CoffeeCompent.Drink;

/**
 * @Author Humin
 * @Date 2018 10 03 17:56
 */
public class Decorator extends Drink {

    Drink compent;
    public Decorator( Drink compent) {
        this.compent=compent;

    }

    @Override
    public String getDescription() {
        return super.description+"-"+super.getPrice()+"  + "+compent.getDescription();
    }

    @Override
    public float getPrice() {
        return super.getPrice()+compent.cost();
    }

    @Override
    public float cost() {
        return super.getPrice()+compent.cost();
    }
}
