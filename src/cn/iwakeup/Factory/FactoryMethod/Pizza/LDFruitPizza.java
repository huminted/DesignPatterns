package cn.iwakeup.Factory.FactoryMethod.Pizza;


/**
 * @Author Humin
 * @Date 2018 10 05 11:18
 */
public class LDFruitPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDFruitPizza");
        System.out.println(name+" Preparing");
    }
}
