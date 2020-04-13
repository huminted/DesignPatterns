package cn.iwakeup.Command.Command;

import cn.iwakeup.Command.Reciver.TV;

/**
 * @Author Humin
 * @Date 2018 10 05 21:26
 */
public class TVCommand_On implements Command {

    private TV mTv;
    public TVCommand_On(TV tv) {
        this.mTv=tv;
    }

    @Override
    public void execute() {
        mTv.On();
        mTv.VolAdd();
    }

    @Override
    public void undo() {
        mTv.Off();
        mTv.VolLess();

    }
}
