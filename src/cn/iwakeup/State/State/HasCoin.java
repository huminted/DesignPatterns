package cn.iwakeup.State.State;

import cn.iwakeup.State.CandyMachine;

import java.util.Random;

/**
 * @Author Humin
 * @Date 2018/10/08 18:17
 */
public class HasCoin implements State {

    private CandyMachine mCandyMachine;
    public HasCoin(CandyMachine machine) {
        this.mCandyMachine=machine;


    }

    @Override
    public void insertCoin() {
        System.out.println("Already Insert Coin, Please Insert Only One Coin");
    }

    @Override
    public void returnCoin() {
        System.out.println("Return Your Coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank is Turning");
        dispense();


    }

    @Override
    public void dispense() {
        mCandyMachine.releaseCandy();
        mCandyMachine.setState(mCandyMachine.OnReadyState);

        int random=new Random().nextInt(4);
        if (mCandyMachine.mCount>0&&random==1){

                System.out.println("You Are Luck! Give You More");
                mCandyMachine.releaseCandy();
                if (mCandyMachine.mCount>0){
                    mCandyMachine.setState(mCandyMachine.OnReadyState);
                }else {
                    mCandyMachine.setState(mCandyMachine.SoldOutState);
                }


        }






    }
}
