package cn.iwakeup.Command.Invoker;

import cn.iwakeup.Command.Command.Command;
import cn.iwakeup.Command.Command.NoCommand;

import java.util.Stack;

/**
 * @Author Humin
 * @Date 2018 10 05 21:33
 */
public class MyController implements Controller {

    private Command [] OnCommands;
    private Command [] OffCommands;

    private Stack<Command> commandStack=new Stack<>();

    public MyController() {

        OnCommands=new Command[5];
        OffCommands=new Command[5];

        for (int i = 0; i < OnCommands.length; i++) {
            OnCommands[i]=new NoCommand();
            OffCommands[i]=new NoCommand();
        }
    }


    public void setCommand(int loc ,Command on,Command off){
        OnCommands[loc]=on;
        OffCommands[loc]=off;
    }

    @Override
    public void onButton(int loc) {
        OnCommands[loc].execute();
        commandStack.push( OnCommands[loc]);
    }

    @Override
    public void offButton(int loc) {
        OffCommands[loc].execute();
        commandStack.push( OffCommands[loc]);

    }

    @Override
    public void undoButton() {
        commandStack.pop().undo();

    }
}
