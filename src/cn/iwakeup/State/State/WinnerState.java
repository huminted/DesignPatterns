package cn.iwakeup.State.State;

import cn.iwakeup.State.CandyMachine;

/**
 * @Author Humin
 * @Date 2018/10/08 18:03
 */
public class WinnerState implements State {

    private CandyMachine mCandyMachine;
    public WinnerState(CandyMachine machine) {
        this.mCandyMachine=machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Has Coin Yet");
    }

    @Override
    public void returnCoin() {
        System.out.println("Has Turn Crank Can't Return");
    }

    @Override
    public void turnCrank() {
        System.out.println("Has Turn Crank Yet Can't Turn Crank");
    }

    @Override
    public void dispense() {
        System.out.println("You are Lucky!");
        mCandyMachine.releaseCandy();
        mCandyMachine.releaseCandy();
    }
}
