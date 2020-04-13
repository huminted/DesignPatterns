package cn.iwakeup.Decorator.CoffeeCompent;

/**
 * @Author Humin
 * @Date 2018 10 03 17:34
 */
public abstract class Drink  {

    public String description;
    public float price;

    public String getDescription() {
        return description+"-"+this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public  float cost(){return  price;}
}
