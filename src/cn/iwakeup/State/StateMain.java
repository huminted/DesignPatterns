package cn.iwakeup.State;

/**
 * @Author Humin
 * @Date 2018/10/08 18:00
 */
public class StateMain {
    public static void main(String a[]){
        CandyMachine candyMachine=new CandyMachine(9);
        candyMachine.insertCoin();
        candyMachine.turnCrank();
        System.out.println(candyMachine.getState());
        candyMachine.returnCoin();





    }
}
