package cn.iwakeup.Bridge.OurCompany;

import cn.iwakeup.Bridge.OtherCompany.Control;

import java.util.Stack;

/**
 * @Author Humin
 * @Date 2018/10/12 21:59
 */
public class newTVControl extends TVControlAbs {

    private int ch=0;
    private boolean isOpen=false;
    private Control mControl;
    private int preCh;
    private Stack<Integer> preChStack=new Stack<>();

    public newTVControl(Control mControl) {
        this.mControl = mControl;
    }

    @Override
    public void OnOff() {
        if (!isOpen){
            mControl.On();
            isOpen=true;
        }else {
            mControl.Off();
            isOpen=false;
        }
    }

    @Override
    public void NextChannel() {
        preCh=ch;
        preChStack.push(ch);
        ch++;
        mControl.setChannel(ch);
    }

    @Override
    public void preChannel() {
        preCh=ch;
        preChStack.push(ch);
        ch--;
        if (ch<0){
            ch=200;
        }
        mControl.setChannel(ch);
    }

    public void Back(){
        mControl.setChannel(preCh);
    }

    public void BackStack(){
        mControl.setChannel(preChStack.pop());
    }
}
