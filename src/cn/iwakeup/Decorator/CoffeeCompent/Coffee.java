package cn.iwakeup.Decorator.CoffeeCompent;

/**
 * @Author Humin
 * @Date 2018 10 03 17:48
 */
public class Coffee extends Drink {




    @Override
    public float cost() {
        return super.getPrice();
    }
}
