package cn.iwakeup.Combination.Iteratpr;

import cn.iwakeup.Combination.Menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author Humin
 * @Date 2018/10/12 15:24
 */
public class ComponsIterator implements Iterator {

    Stack<Iterator> stack=new Stack<>();

    public ComponsIterator(Iterator iterator) {
        stack.push(iterator);

    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()){
            return false;
        }
        Iterator iterator=stack.peek(); //得到一个迭代器
        if (!iterator.hasNext()){       //判断它是否是有子迭代器
            stack.pop();                //如没有，则弹出
            return hasNext();           //再次判断
        }else {
            return true;
        }

    }

    @Override
    public Object next() {
        Iterator iterator= stack.peek();
        MenuComponent menuComponent= (MenuComponent) iterator.next();
        stack.push(menuComponent.getIterator());
        return menuComponent;
    }

    @Override
    public void remove() {

    }
}
