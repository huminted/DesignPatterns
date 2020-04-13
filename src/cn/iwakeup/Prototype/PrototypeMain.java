package cn.iwakeup.Prototype;

import cn.iwakeup.Prototype.Prototype.Mail;
import cn.iwakeup.Prototype.Prototype.MailTemplate;

import java.util.Random;

/**
 * @Author Humin
 * @Date 2018/10/17 19:11
 */
public class PrototypeMain {
    public static void main(String a[]) throws CloneNotSupportedException {


        send();


    }

    private static void send() throws CloneNotSupportedException {
        MailTemplate mailTemplate=new MailTemplate("这个月账单已到账","国庆节打折活动.......");
        Mail mail=new Mail(mailTemplate);

        for (int i = 0; i <10 ; i++) {

            Mail cloneMail = (Mail) mail.clone();
            cloneMail.setMail(randomStr()+"@live.com");
            cloneMail.setName(randomStr());
            sendMails(cloneMail);
        }
    }

    public static void sendMails(Mail mail){

        System.out.println(mail.getName()+"，先生/女士你好: "+mail.getMail()+" " +mail.getTitle()+mail.getThings());

    }


    private static String randomStr(){
        String str="acbdefghijklmnopqrstuvwxyz";
        StringBuilder strbuilder=new StringBuilder();

        for (int i = 0; i <6 ; i++) {
            strbuilder.append(str.charAt(new Random().nextInt(10)));
        }

        return strbuilder.toString();
    }


}
