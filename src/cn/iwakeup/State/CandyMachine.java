package cn.iwakeup.State;

import cn.iwakeup.State.State.*;

import java.util.Random;

/**
 * @Author Humin
 * @Date 2018/10/08 18:06
 */
public class CandyMachine  {


    public int mCount;
    public State state,WinnerState,OnReadyState,HasCoin,SoldOutState,SoldState;
    public CandyMachine(int count) {
        this.mCount=count;
        this.WinnerState=new WinnerState(this);
        this.OnReadyState=new OnReadyState(this);
        this.HasCoin=new HasCoin(this);
        this.SoldOutState=new SoldOutState(this);
        this.SoldState=new SoldState(this);

       if (count>0){
           state=OnReadyState;
       }else {
           state=SoldOutState;
       }



    }

    public void insertCoin() {
        state.insertCoin();
    }


    public void returnCoin() {
        state.returnCoin();
    }


    public void turnCrank() {
        state.turnCrank();
    }



    public void dispense() {

    }


    public void releaseCandy(){

        System.out.println("Your Candy Roll Out !!!");
        mCount--;

    }

    public void setState(State state) {
        this.state = state;
    }

    public String getState(){
        return  state.toString();
    }


}
