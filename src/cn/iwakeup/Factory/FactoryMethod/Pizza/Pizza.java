package cn.iwakeup.Factory.FactoryMethod.Pizza;

/**
 * @Author Humin
 * @Date 2018 10 05 10:40
 */
public abstract class Pizza  {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();
    public void bake(){
        System.out.println(name+" Backing ");
    }

    public void cut(){
        System.out.println(name+" Cutting ");
    }

    public void box(){
        System.out.println(name+" Boxing ");
    }
}
