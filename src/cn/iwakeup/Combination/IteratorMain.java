package cn.iwakeup.Combination;

import cn.iwakeup.Combination.Menu.MenuComponent;
import cn.iwakeup.Combination.Menu.MenuItem;
import cn.iwakeup.Combination.Menu.CakeRoom;
import cn.iwakeup.Combination.Menu.DinnerRoom;

/**
 * @Author Humin
 * @Date 2018/10/08 20:02
 */
public class IteratorMain {

    public static void main(String a[]){

        MenuComponent cakeRoom=new CakeRoom();
        MenuComponent dinnerRoom=new DinnerRoom();

        Waiter waiter=new Waiter();
        //自己实现的迭代器，和java内置的迭代器

        waiter.addIterator(cakeRoom);
        waiter.addIterator(dinnerRoom);
        waiter.printMenu();


    }
}
