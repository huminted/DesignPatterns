package cn.iwakeup.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/08 19:51
 */
public class MenuItem {
    private String name;
    private boolean isVege;
    private float price;

    public MenuItem(String name, boolean isVege, float price) {
        this.name = name;
        this.isVege = isVege;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVege() {
        return isVege;
    }

    public void setVege(boolean vege) {
        isVege = vege;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
