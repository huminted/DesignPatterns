package cn.iwakeup.Factory.FactoryMethod.Pizza;

/**
 * @Author Humin
 * @Date 2018 10 05 10:44
 */
public class FruitPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("FruitPizza");
        System.out.println(name+" Preparing ");
    }
}
