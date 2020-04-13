package cn.iwakeup.Combination.Menu;

import cn.iwakeup.Combination.Iteratpr.NullIterator;

import java.util.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/12 14:58
 */
public abstract class MenuComponent  {

    public String  getName(){

        return "";
    }

    public float getPrice(){

        return 0;
    }
    public boolean IsVeg(){
        return false;
    }

    public abstract void print();

    public Iterator getIterator(){
        return new NullIterator();
    }
}
