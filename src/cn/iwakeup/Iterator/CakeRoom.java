package cn.iwakeup.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/08 19:54
 */
public class CakeRoom {
    private MenuItem  [] menuItems;
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
        return  new MyIterator();
    }
}
