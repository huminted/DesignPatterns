package cn.iwakeup.Command.Command;

import cn.iwakeup.Command.Reciver.Light;

/**
 * @Author Humin
 * @Date 2018 10 05 21:10
 */
public class LightCommand_On implements Command {

    private Light mLight;
    public LightCommand_On(Light light) {
        this.mLight=light;
    }

    @Override
    public void execute() {
        mLight.On();
    }

    @Override
    public void undo() {
        mLight.Off();
    }
}
