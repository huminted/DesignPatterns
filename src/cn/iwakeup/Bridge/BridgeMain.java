package cn.iwakeup.Bridge;

import cn.iwakeup.Bridge.OtherCompany.LGControl;
import cn.iwakeup.Bridge.OtherCompany.SonyControl;
import cn.iwakeup.Bridge.OurCompany.TVControl;
import cn.iwakeup.Bridge.OurCompany.newTVControl;

/**
 * @Author Humin
 * @Date 2018/10/12 21:46
 */
public class BridgeMain {
    public static void main(String a[]){
        TVControl sony=new TVControl(new SonyControl());
        sony.OnOff();
        sony.NextChannel();
        sony.NextChannel();
        sony.preChannel();
        sony.OnOff();

        newTVControl newLGTVControl =new newTVControl(new LGControl());
        newLGTVControl.OnOff();
        newLGTVControl.NextChannel();
        newLGTVControl.NextChannel();
        newLGTVControl.preChannel();
        newLGTVControl.BackStack();
        newLGTVControl.BackStack();
        newLGTVControl.BackStack();
        newLGTVControl.OnOff();


    }
}
