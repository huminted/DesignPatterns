package cn.iwakeup.Command;

import cn.iwakeup.Command.Command.*;
import cn.iwakeup.Command.Invoker.MyController;
import cn.iwakeup.Command.Reciver.Light;
import cn.iwakeup.Command.Reciver.TV;

/**
 * @Author Humin
 * @Date 2018 10 05 21:07
 */
public class CommondMain {

    public static void main(String a[]){

        MyController myController=new MyController();

        Light bedLight=new Light("BedRoomLight");
        Light bathLight=new Light("BathroomLight");

        TV TV=new TV("Mi TV");

        Command bedLight_on=new LightCommand_On(bedLight);
        Command bedLight_off =new LightCommand_Off(bedLight);

        Command bathLight_on=new LightCommand_On(bathLight);
        Command bathLight_off =new LightCommand_Off(bathLight);

        Command TV_on=new TVCommand_On(TV);
        Command TV_off=new TVConmand_Off(TV);




        myController.setCommand(0,bedLight_on,bedLight_off);
        myController.setCommand(1,bathLight_on,bathLight_off);
        myController.setCommand(2,TV_on,TV_off);


        /*
                 On   Off
                  _____
                 | O O | BedRoomLight
                 | O O | BathroomLight
                 | O O | TV
                 | O O | TVUndo
                 | O O | MacroButton
                 |_____|

         */

//        myController.onButton(0);
//        myController.offButton(0);
//
//
//        myController.onButton(1);
//        myController.offButton(1);
//        myController.undoButton();
//
//        myController.onButton(2);
//        myController.offButton(2);


        MacroCommand macroCommand=new MacroCommand(bedLight_on,bathLight_on,TV_on);
        macroCommand.start();

    }
}
