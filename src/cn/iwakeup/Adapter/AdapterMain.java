package cn.iwakeup.Adapter;


import cn.iwakeup.Adapter.ClassAdapter.Adapter.TurkeyAdapter;
import cn.iwakeup.Adapter.ClassAdapter.Target.Duck;
import cn.iwakeup.Adapter.ClassAdapter.Target.RedDuck;

/**
 * @Author Humin
 * @Date 2018 10 06 13:34
 */
public class AdapterMain {

    public static void main(String a[]){

        /**
        * @Description:    对象适配器
        * @return
        */
//        Duck duck=new RedDuck();
//        duck.Bray();
//        duck.Fly();
//
//        Turkey turkey=new RedTurkey();
//
//        Duck turkey2Duck=new TurkeyAdapter(turkey);
//        turkey2Duck.Bray();
//        turkey2Duck.Fly();

        /**
        * @Description:    类适配器 ,不灵活,只能继承都特定的类
        * @return
        */

        Duck duck=new RedDuck();
        duck.Bray();
        duck.Fly();

        cn.iwakeup.Adapter.ClassAdapter.Target.Duck turkey2Duck=new TurkeyAdapter();
        turkey2Duck.Bray();
        turkey2Duck.Fly();



    }
}
