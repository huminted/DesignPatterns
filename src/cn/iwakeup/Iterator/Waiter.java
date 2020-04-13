package cn.iwakeup.Iterator;

import java.util.ArrayList;

/**
 * @Author Humin
 * @Date 2018/10/08 20:02
 */
public class Waiter {


    private CakeRoom  cakeRoom;
    private DinnerRoom dinnerRoom;

    private MenuItem[] menuItems;
    private ArrayList<java.util.Iterator> iterators=new ArrayList<>();

    public Waiter() {


    }

    public void addIterator(java.util.Iterator iterator){
        iterators.add(iterator);
    }

    public void printMenu(){
        for (java.util.Iterator iterator: iterators){

            while (iterator.hasNext()){
                MenuItem item= (MenuItem) iterator.next();
                System.out.println(item.getName()+" "+item.getPrice());
            }

        }

    }
}
