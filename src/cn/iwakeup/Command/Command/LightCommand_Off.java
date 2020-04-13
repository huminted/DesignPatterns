package cn.iwakeup.Command.Command;

import cn.iwakeup.Command.Reciver.Light;

/**
 * @Author Humin
 * @Date 2018 10 05 21:25
 */
public class LightCommand_Off implements Command {

    private Light mLight;
    public LightCommand_Off(Light light) {
        this.mLight=light;
    }

    @Override
    public void execute() {
        mLight.Off();
    }

    @Override
    public void undo() {
        mLight.On();
    }
}
