package cn.iwakeup.Combination.Menu;

import cn.iwakeup.Combination.Iteratpr.ComponsIterator;
import cn.iwakeup.Combination.Menu.MenuComponent;
import cn.iwakeup.Combination.Menu.MenuItem;

/**
 * @Author Humin
 * @Date 2018/10/08 19:54
 */
public class CakeRoom extends MenuComponent {
    private MenuItem[] menuItems;
    private int position;

    public CakeRoom() {
        menuItems=new MenuItem[3];
        menuItems[0]=new MenuItem("Cake1",false,20f);
        menuItems[1]=new MenuItem("Cake2",false,12f);
        menuItems[2]=new MenuItem("Cake3",false,22f);

    }


    public void  addMenuItem(MenuItem item){
        menuItems[3]=item;
    }

    @Override
    public void print() {
        System.out.println("*********This is CakeRoom*********");
    }


    class MyIterator implements java.util.Iterator{

        @Override
        public boolean hasNext() {
            return position < menuItems.length;
        }

        @Override
        public Object next() {
            MenuItem item=menuItems[position];
            position++;
            return item;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public java.util.Iterator getIterator(){
        return  new ComponsIterator(new MyIterator());
    }
}
