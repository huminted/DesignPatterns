package cn.iwakeup.Factory.AbsFactory.Pizza;

/**
 * @Author Humin
 * @Date 2018 10 05 10:44
 */
public class ChinesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("ChinesePizza");
        System.out.println(name+" Preparing ");
    }
}
