package cn.iwakeup.Builder.Builder;

import cn.iwakeup.Builder.Vacation.Vacation;

/**
 * @Author Humin
 * @Date 2018/10/13 12:07
 */
public class BuilderSelf {


    private Vacation mVacation;
    public BuilderSelf(Vacation vacation) {
        mVacation=vacation;
    }

    public BuilderSelf addDay(){
        mVacation.addDay();
        return this;
    }

    public BuilderSelf addTicket(String t){
        mVacation.addTicket(t);
        return this;
    }

    public BuilderSelf addEvent(String e){
        mVacation.addEvent(e);
        return this;
    }

    public BuilderSelf addHotel(String h){
        mVacation.addHotel(h);
        return this;
    }

    public void printVacation(){
        mVacation.showInfo();
    }
}
