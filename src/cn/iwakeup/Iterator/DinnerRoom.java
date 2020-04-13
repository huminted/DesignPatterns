package cn.iwakeup.Iterator;

import java.util.ArrayList;

/**
 * @Author Humin
 * @Date 2018/10/08 19:50
 */
public class DinnerRoom {

    ArrayList<MenuItem> arrayList=new ArrayList<>();

    private int position;
    public DinnerRoom() {
        MenuItem menuItem=new MenuItem("青椒肉丝",false,100f);
        MenuItem menuItem2=new MenuItem("桂花鱼",false,200f);
        MenuItem menuItem3=new MenuItem("土豆丝",true,200f);
        arrayList.add(menuItem);
        arrayList.add(menuItem2);
        arrayList.add(menuItem3);

        position=0;
    }

    public void addMenuItem(MenuItem item){
        arrayList.add(item);
    }

    class  MyIterator implements java.util.Iterator {


        @Override
        public boolean hasNext() {
            return position < arrayList.size();

        }

        @Override
        public Object next() {
            MenuItem item=arrayList.get(position);
            position++;
            return item;
        }
    }

    public ArrayList<MenuItem> getArrayList() {
        return arrayList;
    }

    public java.util.Iterator getIterator(){
        return  arrayList.iterator();
    }


}
