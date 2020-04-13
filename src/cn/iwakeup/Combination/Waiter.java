package cn.iwakeup.Combination;


import cn.iwakeup.Combination.Menu.CakeRoom;
import cn.iwakeup.Combination.Menu.DinnerRoom;
import cn.iwakeup.Combination.Menu.MenuComponent;
import cn.iwakeup.Combination.Menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/08 20:02
 */
public class Waiter {


    private CakeRoom cakeRoom;
    private DinnerRoom dinnerRoom;

    private MenuItem[] menuItems;
    private ArrayList<MenuComponent> menuComponents=new ArrayList<>();

    public Waiter() {


    }

    public void addIterator(MenuComponent iterator){
        menuComponents.add(iterator);

    }

    public void printMenu(){
        for (MenuComponent MenuComponent: menuComponents){

            MenuComponent.print();
            Iterator subIterator=MenuComponent.getIterator();

            while (subIterator.hasNext()){
                MenuComponent item= (MenuComponent) subIterator.next();
                item.print();
            }

        }

    }
}
