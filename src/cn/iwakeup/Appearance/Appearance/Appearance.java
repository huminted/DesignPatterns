package cn.iwakeup.Appearance.Appearance;

import cn.iwakeup.Appearance.ChileController.Popcorn;
import cn.iwakeup.Appearance.ChileController.Screen;
import cn.iwakeup.Appearance.ChileController.Speaker;
import cn.iwakeup.Appearance.ChileController.TV;

import java.util.Scanner;

/**
 * @Author Humin
 * @Date 2018/10/07 19:12
 */
public class Appearance  {

    private TV mtv;
    private Speaker mSpeaker;
    private Screen mScreen;
    private Popcorn mPopcorn;
    public Appearance() {

        mtv=new TV();
        mSpeaker=new Speaker();
        mScreen=new Screen();
        mPopcorn=new Popcorn();

    }

    public void start(){

        mtv.On();
        mSpeaker.On();
        mScreen.On();
        mPopcorn.On();
    }

    public void end(){
        mtv.Off();
        mSpeaker.Off();
        mScreen.Off();
        mPopcorn.Off();
    }
}
