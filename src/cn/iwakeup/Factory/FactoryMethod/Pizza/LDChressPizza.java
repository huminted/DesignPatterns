package cn.iwakeup.Factory.FactoryMethod.Pizza;



/**
 * @Author Humin
 * @Date 2018 10 05 11:17
 */
public class LDChressPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDChressPizza");
        System.out.println(name+" Preparing");
    }
}
