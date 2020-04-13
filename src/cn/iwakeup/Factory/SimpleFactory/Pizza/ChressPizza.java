package cn.iwakeup.Factory.SimpleFactory.Pizza;

/**
 * @Author Humin
 * @Date 2018 10 05 10:43
 */
public class ChressPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("ChressPizza");
        System.out.println(name+" Preparing ");
    }
}
