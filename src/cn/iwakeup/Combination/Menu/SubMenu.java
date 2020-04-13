package cn.iwakeup.Combination.Menu;

import cn.iwakeup.Combination.Iteratpr.ComponsIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/12 15:06
 */
public class SubMenu extends MenuComponent {

    ArrayList<MenuComponent> menuItems=new ArrayList<>();
    public SubMenu() {
        menuItems.add(new MenuItem("Cola",false,22f));
        menuItems.add(new MenuItem("Tea",false,21));
        menuItems.add(new MenuItem("Xuebi",false,19f));

    }


    @Override
    public Iterator getIterator() {
        return new ComponsIterator(menuItems.iterator());
    }

    @Override
    public void print() {
        System.out.println("******************This is SubMenu!!******************");
    }
}
