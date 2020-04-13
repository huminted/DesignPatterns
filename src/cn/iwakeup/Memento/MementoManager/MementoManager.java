package cn.iwakeup.Memento.MementoManager;

import cn.iwakeup.Memento.Originator.MementoIF;

import java.util.HashMap;

/**
 * @Author Humin
 * @Date 2018/10/15 17:27
 */
public class MementoManager {
    HashMap<String, MementoIF> mMap;
    public MementoManager() {
        mMap=new HashMap<>();
    }

    public void createMemento(String name ,MementoIF memento){

        mMap.put(name,memento);
    }

    public MementoIF getMemento(String name){

        return mMap.get(name);
    }
}
