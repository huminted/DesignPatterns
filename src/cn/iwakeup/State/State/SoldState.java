package cn.iwakeup.State.State;

import cn.iwakeup.State.CandyMachine;

/**
 * @Author Humin
 * @Date 2018/10/08 18:23
 */
public class SoldState implements State {
    private CandyMachine mCandyMachine;

    public SoldState(CandyMachine machine) {
        this.mCandyMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sold Out Closing");
    }

    @Override
    public void returnCoin() {
        System.out.println("You Have Turned Please Insert Another Coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Have Turned Please Insert Another Coin");
    }

    @Override
    public void dispense() {
        mCandyMachine.releaseCandy();
    }
}
