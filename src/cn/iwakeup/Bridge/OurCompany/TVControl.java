package cn.iwakeup.Bridge.OurCompany;

import cn.iwakeup.Bridge.OtherCompany.Control;

/**
 * @Author Humin
 * @Date 2018/10/12 21:54
 */
public class TVControl extends TVControlAbs {

    private boolean isOn=false;
    private Control mControl;
    private int ch;
    private int vol=0;
    public TVControl(Control control) {
        this.mControl = control;
    }

    @Override
    public void OnOff() {
        if (!isOn){
            mControl.On();
            isOn=true;
        }else {
            mControl.Off();
            isOn=false;
        }

    }

    @Override
    public void NextChannel() {
        ch++;
        mControl.setChannel(ch);
    }

    @Override
    public void preChannel() {
       ch--;
       if (ch<0){
           ch=200;
       }
       mControl.setChannel(ch);
    }
}
