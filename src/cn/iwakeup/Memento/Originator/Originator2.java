package cn.iwakeup.Memento.Originator;

import java.util.HashMap;

/**
 * @Author Humin
 * @Date 2018/10/15 18:05
 */
public class Originator2 {

    HashMap<String,String> mMap;
    public Originator2() {
        mMap=new HashMap<>();
    }


    public Memento createMemento(){
        return new Memento(mMap);
    }


    public void restoreMemento(MementoIF memento){
        mMap=  ((Memento)memento).getMap();
    }

    public void addFirstState(){
        mMap.put("Gate","1");
        mMap.put("Score","0");
        mMap.put("Life","100");

    }

    public void addSecondState(){
        mMap.put("Gate","2");
        mMap.put("Score","100000");
        mMap.put("Life","50");

    }

    public void showState(){
        System.out.println(mMap.toString());
    }

    private class Memento implements MementoIF{
        HashMap<String,String> mMap;

        private Memento(HashMap<String, String> map) {
            mMap = new HashMap<>(map);
        }

        private HashMap<String, String> getMap() {
            return mMap;
        }
    }
}
