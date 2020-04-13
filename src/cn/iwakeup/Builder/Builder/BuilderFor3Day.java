package cn.iwakeup.Builder.Builder;

import cn.iwakeup.Builder.Vacation.Vacation;

/**
 * @Author Humin
 * @Date 2018/10/13 11:32
 */
public class BuilderFor3Day extends AbsBuilder {

    private Vacation mVacation;
    public BuilderFor3Day(Vacation vacation) {
        mVacation=vacation;
    }

    @Override
    void addDay() {
        mVacation.addDay();
    }

    @Override
    void addEvent(String e) {
        mVacation.addEvent(e);
    }

    @Override
    void addTicket(String t) {
        mVacation.addTicket(t);
    }

    @Override
    void addHotel(String h) {
        mVacation.addHotel(h);
    }

    public void build(){
        addTicket("飞机票");
        addEvent("TO Beijing");
        addHotel("四季酒店");

        addDay();
        addTicket("故宫门票");
        addEvent("游览故宫");
        addHotel("四季酒店");

        addDay();
        addTicket("圆明园门票");
        addEvent("游览圆明园");
        addHotel("四季酒店");


    }
    public void printVacation(){
        mVacation.showInfo();
    }

}
