package cn.iwakeup.Memento.Originator;

import cn.iwakeup.Combination.Menu.MenuComponent;

import java.util.ArrayList;

/**
 * @Author Humin
 * @Date 2018/10/15 17:30
 */
public class Originator implements MementoIF{

    ArrayList<String> state;

    public Originator() {
        state=new ArrayList<>();
    }


    public MementoIF createMemento() {

        return new Memento(state);
    }


    public void restoreMemento(Memento restoreMemento) {
        state=restoreMemento.getState();
    }



    public void addFirstState(){
        state.clear();
        state.add("Gate:1");
        state.add("Life:100");
        state.add("Money:1000");
    }

    public void addSecondState(){
        state.clear();
        state.add("Gate:2");
        state.add("Life:80");
        state.add("Money:8000");
    }



    public void showState(){
        System.out.println("State: "+state.toString());
    }


    public class Memento implements MementoIF{

        ArrayList<String> state;

        private Memento(ArrayList<String> saveData) {
            this.state=new ArrayList<>(saveData);
        }

        public ArrayList<String> getState() {
            return state;
        }
    }
}
