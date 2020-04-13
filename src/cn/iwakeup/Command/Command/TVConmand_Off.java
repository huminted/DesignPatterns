package cn.iwakeup.Command.Command;

import cn.iwakeup.Command.Reciver.TV;

/**
 * @Author Humin
 * @Date 2018 10 05 21:26
 */
public class TVConmand_Off implements  Command {

    private TV mTv;
    public TVConmand_Off(TV tv) {
        this.mTv=tv;
    }
    @Override
    public void execute() {
        mTv.Off();
        mTv.VolLess();
    }

    @Override
    public void undo() {
        mTv.On();
        mTv.VolAdd();
    }
}
