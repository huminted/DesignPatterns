package cn.iwakeup.Strategy;

import cn.iwakeup.Strategy.Duck.GreenDuck;
import cn.iwakeup.Strategy.Duck.RedDuck;


public class StrategyMain {

    public static void main(String[] args) {

        var greenDuck=new GreenDuck();
        greenDuck.Display();
        greenDuck.Bray();
        greenDuck.Swim();
        greenDuck.Fly();

        var redDuck=new RedDuck();
        redDuck.Display();
        redDuck.Bray();
        redDuck.Swim();
        redDuck.Fly();




    }
}
