package cn.iwakeup.Builder.Vacation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author Humin
 * @Date 2018/10/13 11:30
 */
public class Vacation {

    Date mStDay;
    int mDays;
    ArrayList<VacationDay> vacationDays=new ArrayList<>();
    VacationDay mVacationDay;

    public Vacation( String stDay) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
        mStDay=sdf.parse(stDay);

        mVacationDay=new VacationDay(mStDay);
        vacationDays.add(mVacationDay);
        mDays++;
    }


    public void addDay(){

        mVacationDay=new VacationDay(nextDay());
        vacationDays.add(mVacationDay);
        mDays++;

    }

    public void addEvent(String e){
        mVacationDay.addEvent(e);
    }
    public void addTicket(String t){
        mVacationDay.addTicket(t);
    }
    public void addHotel(String h){
        mVacationDay.addHotel(h);
    }

    private Date nextDay(){
        Calendar  calendar=Calendar.getInstance();
        calendar.setTime(mStDay);
        calendar.add(Calendar.DATE,mDays);
        return  calendar.getTime()  ;
    }

    public  void showInfo(){

        for (int i = 0; i <vacationDays.size() ; i++) {
            System.out.println("--------"+(i+1)+"Day"+"--------");
            System.out.println(vacationDays.get(i).showInfo());

        }
    }

}
