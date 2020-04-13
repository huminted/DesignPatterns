package cn.iwakeup.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/08 20:02
 */
public class IteratorMain {

    public static void main(String a[]){

        CakeRoom cakeRoom=new CakeRoom();
        DinnerRoom dinnerRoom=new DinnerRoom();
        dinnerRoom.addMenuItem(new MenuItem("西瓜",false,20f));
        Waiter waiter=new  Waiter();
        //自己实现的迭代器，和java内置的迭代器
        waiter.addIterator(cakeRoom.getIterator());
        waiter.addIterator(dinnerRoom.getIterator());
        waiter.printMenu();
    }
}
