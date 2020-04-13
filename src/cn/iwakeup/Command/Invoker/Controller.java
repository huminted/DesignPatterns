package cn.iwakeup.Command.Invoker;

/**
 * @Author Humin
 * @Date 2018 10 05 21:31
 */
public interface Controller {

    void onButton(int loc);
    void offButton(int loc);
    void undoButton();
}
