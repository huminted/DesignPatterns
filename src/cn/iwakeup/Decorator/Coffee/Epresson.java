package cn.iwakeup.Decorator.Coffee;

import cn.iwakeup.Decorator.CoffeeCompent.Coffee;
import cn.iwakeup.Decorator.CoffeeCompent.Drink;

/**
 * @Author Humin
 * @Date 2018 10 03 17:40
 */
public class Epresson extends Coffee {

    public Epresson() {
      setDescription("Epresson");
      setPrice(5.0f);
    }
}
