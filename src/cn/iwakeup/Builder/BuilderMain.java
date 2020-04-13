package cn.iwakeup.Builder;

import cn.iwakeup.Builder.Builder.BuilderFor3Day;
import cn.iwakeup.Builder.Builder.BuilderSelf;
import cn.iwakeup.Builder.Vacation.Vacation;

import java.text.ParseException;

/**
 * @Author Humin
 * @Date 2018/10/13 11:30
 */
public class BuilderMain {

    public static void main(String a[]) throws ParseException {
//        Vacation vacation=new Vacation("2018-9-10");
//        BuilderFor3Day day=new BuilderFor3Day(vacation);
//        day.build();
//        day.printVacation();

        BuilderBySelf();
    }


    private static void BuilderBySelf() throws ParseException {
        Vacation vacation=new Vacation("2018-9-10");
        BuilderSelf self=new BuilderSelf(vacation);
        self.addTicket("飞机票").addEvent("To Beijing").addHotel("四季酒店")
            .addDay().addTicket("故宫门票").addEvent("游览故宫").addHotel("希尔顿")
            .addDay().addTicket("圆明园门票").addEvent("游览圆明园").addHotel("如家INN");
        self.printVacation();

    }
}
