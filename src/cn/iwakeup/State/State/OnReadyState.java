package cn.iwakeup.State.State;

import cn.iwakeup.State.CandyMachine;

/**
 * @Author Humin
 * @Date 2018/10/08 18:13
 */
public class OnReadyState implements State {

    private CandyMachine mCandyMachine;
    public OnReadyState(CandyMachine machine) {
        this.mCandyMachine=machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please Insert Coin");
        mCandyMachine.setState(mCandyMachine.HasCoin);
        System.out.println("Get One Coin");
    }

    @Override
    public void returnCoin() {
        System.out.println("You Don't Insert Coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Don't Insert Coin");
    }

    @Override
    public void dispense() {
        System.out.println("You Don't Insert Coin");
    }
}
