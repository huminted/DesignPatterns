package cn.iwakeup.ChainofResponsibility.Request;

/**
 * @Author Humin
 * @Date 2018/10/14 10:58
 */
public class Request {

    private int id,price, sum;
    public Request(int id,int price,int num) {
        this.id=id;
        this.price=price;
        this.sum =num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getTotal(){
        return  sum*price;
    }
}
