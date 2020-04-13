package cn.iwakeup.Command.Command;

/**
 * @Author Humin
 * @Date 2018 10 05 21:58
 */
public class MacroCommand {

    private Command [] mCommands;
    public MacroCommand(Command... commands) {
        this.mCommands=commands;

    }

    public void start(){
        for (Command command: mCommands) {
            command.execute();
        }
    }
}
