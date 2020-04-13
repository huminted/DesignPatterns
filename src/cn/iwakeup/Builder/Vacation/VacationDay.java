package cn.iwakeup.Builder.Vacation;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author Humin
 * @Date 2018/10/13 11:31
 */
public class VacationDay {

    ArrayList<String> tickets;
    ArrayList<String> events;
    ArrayList<String> hotels;
    private Date mDate;

    public VacationDay(Date date) {
        tickets=new ArrayList<>();
        events=new ArrayList<>();
        hotels=new ArrayList<>();
        mDate=date;

    }
     void addEvent(String e){
         events.add(e);
     }
     void addTicket(String t){
         tickets.add(t);
     }
     void addHotel(String h){
         hotels.add(h);
     }

     String showInfo(){
        StringBuilder builder=new StringBuilder();
        builder.append(mDate);
        builder.append(tickets);
        builder.append(events);
        builder.append(hotels);

         return builder.toString();
     }

}
