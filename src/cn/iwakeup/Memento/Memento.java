package cn.iwakeup.Memento;

import cn.iwakeup.Memento.MementoManager.MementoManager;
import cn.iwakeup.Memento.Originator.MementoIF;
import cn.iwakeup.Memento.Originator.Originator;
import cn.iwakeup.Memento.Originator.Originator2;

/**
 * @Author Humin
 * @Date 2018/10/15 17:25
 */
public class Memento {

    public static void main(String a[]){

        MementoManager manager=new MementoManager();

        Originator firstO=new Originator();
        firstO.addFirstState();
        firstO.showState();


        MementoIF firstSaveDate=firstO.createMemento();
        manager.createMemento("firstO",firstSaveDate);

        firstO.addSecondState();
        firstO.showState();


        firstO.restoreMemento((Originator.Memento) manager.getMemento("firstO"));
        firstO.showState();

        System.out.println("--------------2---------------");

        Originator2 originator2=new Originator2();
        originator2.addFirstState();
        originator2.showState();

        MementoIF originator2FirstSaveData=originator2.createMemento();
        manager.createMemento("originator2",originator2FirstSaveData);
        originator2.addSecondState();
        originator2.showState();


        originator2.restoreMemento( manager.getMemento("originator2"));
        originator2.showState();


    }
}
