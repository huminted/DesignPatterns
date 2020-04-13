package cn.iwakeup.Combination.Menu;

import cn.iwakeup.Combination.Iteratpr.ComponsIterator;
import cn.iwakeup.Combination.Menu.MenuComponent;
import cn.iwakeup.Combination.Menu.MenuItem;
import cn.iwakeup.Combination.Menu.SubMenu;

import java.util.ArrayList;

/**
 * @Author Humin
 * @Date 2018/10/08 19:50
 */
public class DinnerRoom extends MenuComponent {

    ArrayList<MenuComponent> arrayList=new ArrayList<>();

    private int position;
    public DinnerRoom() {
        MenuItem menuItem=new MenuItem("青椒肉丝",false,100f);
        MenuItem menuItem2=new MenuItem("桂花鱼",false,200f);
        MenuItem menuItem3=new MenuItem("土豆丝",true,200f);
        arrayList.add(menuItem);
        arrayList.add(menuItem2);
        arrayList.add(menuItem3);
        arrayList.add(new SubMenu());

        position=0;
    }

    public void addMenuItem(MenuItem item){
        arrayList.add(item);
    }

    @Override
    public void print() {
        System.out.println("*********This is DinnerRoom*********");
    }

    class  MyIterator implements java.util.Iterator {


        @Override
        public boolean hasNext() {
            return position < arrayList.size();

        }

        @Override
        public Object next() {
            MenuComponent item=arrayList.get(position);
            position++;
            return item;
        }
    }

    public ArrayList<MenuComponent> getArrayList() {
        return arrayList;
    }

    public java.util.Iterator getIterator(){
        return  new ComponsIterator(arrayList.iterator());
    }


}
