package cn.iwakeup.Combination.Iteratpr;

import java.util.Iterator;

/**
 * @Author Humin
 * @Date 2018/10/12 15:15
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
