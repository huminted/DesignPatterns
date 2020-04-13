package cn.iwakeup.State.State;

import cn.iwakeup.State.CandyMachine;

/**
 * @Author Humin
 * @Date 2018/10/08 18:23
 */
public class SoldOutState implements State {
    private CandyMachine mCandyMachine;

    public SoldOutState(CandyMachine machine) {
        this.mCandyMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sold Out Closing");
    }

    @Override
    public void returnCoin() {
        System.out.println("Sold Out Closing");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold Out Closing");
    }

    @Override
    public void dispense() {
        System.out.println("Sold Out Closing");
    }
}
