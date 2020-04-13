package cn.iwakeup.Mediator.Mediator;

import cn.iwakeup.Mediator.Colleague.*;

import java.util.HashMap;

/**
 * @Author Humin
 * @Date 2018/10/17 16:42
 */
public class MyMediator extends Mediator {

    HashMap<String,Colleague> mColleagueHashMap;
    HashMap<String,Colleague> innerMap;

    public MyMediator() {
        mColleagueHashMap = new HashMap<>();
        innerMap=new HashMap<>();
    }

    @Override
    public void Register(String ColleagueName, Colleague colleague) {
        mColleagueHashMap.put(ColleagueName,colleague);

        if (colleague instanceof Alarm){
            innerMap.put("Alarm",colleague);
        }else if (colleague instanceof Light){
            innerMap.put("Light",colleague);
        }else if (colleague instanceof TV){
            innerMap.put("TV",colleague);
        }else if (colleague instanceof CoffeeMachine){
            innerMap.put("CoffeeMachine",colleague);
        }

    }


    /**
    * @Description:    GetMessage
    * @return          null
     *               闹钟 0   灯打开，咖啡机打开，电视打开，
     *               咖啡机 1  关灯 关电视
     *
    */
    @Override
    public void GetMessage(int message,String ColleagueName) {

        //该方式必须知道注册时的名字，才能获取该实例
//        if (message==0){
//           if ( mColleagueHashMap.get(ColleagueName) instanceof Alarm){
//               mColleagueHashMap.get("BedRoom Light").Open();
//               mColleagueHashMap.get("coffeeMachine").Open();
//               mColleagueHashMap.get("Room TV").Open();
//           }
//        }else if (message==1){
//            mColleagueHashMap.get("BedRoom Light").Off();
//            mColleagueHashMap.get("Room TV").Off();
//        }

        //无需知道注册名，innerMap会自动映射到该实例
        if (message==0){
            if ( mColleagueHashMap.get(ColleagueName) instanceof Alarm){
                innerMap.get("Light").Open();
                innerMap.get("CoffeeMachine").Open();
                innerMap.get("TV").Open();
            }
        }else if (message==1){
            innerMap.get("Light").Off();
            innerMap.get("TV").Off();
        }

    }

    @Override
    public void SendMessage() {

    }
}
