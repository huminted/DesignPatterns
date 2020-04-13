package cn.iwakeup.Mediator;

import cn.iwakeup.Mediator.Colleague.Alarm;
import cn.iwakeup.Mediator.Colleague.CoffeeMachine;
import cn.iwakeup.Mediator.Colleague.Light;
import cn.iwakeup.Mediator.Colleague.TV;
import cn.iwakeup.Mediator.Mediator.Mediator;
import cn.iwakeup.Mediator.Mediator.MyMediator;

/**
 * @Author Humin
 * @Date 2018/10/17 16:38
 */
public class MediatorMain {

    public static void main(String a[]){

        Mediator mediator=new MyMediator();

        TV tv=new TV("Room TV",mediator);
        Light light=new Light("BedRoom Light",mediator);
        Alarm alarm=new Alarm("Alarm",mediator);
        CoffeeMachine coffeeMachine=new CoffeeMachine("CoffeeMachine",mediator);

        mediator.Register("Room TV",tv);
        mediator.Register("BedRoom Light",light);
        mediator.Register("Alarm",alarm);
        mediator.Register("coffeeMachine",coffeeMachine);


        alarm.sendMessage(0);
        alarm.sendMessage(1);


    }
}
