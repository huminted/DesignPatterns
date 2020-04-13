package cn.iwakeup.Prototype.Prototype;

import java.util.Random;

/**
 * @Author Humin
 * @Date 2018/10/17 19:12
 */
public class Mail  implements  Cloneable {

    private String title;
    private String things;
    private MailTemplate mMailTemplate;

    private String mail;
    private String name;
    public Mail(MailTemplate mailTemplate) {
        this.mMailTemplate=mailTemplate;
        this.title=mailTemplate.getTitle();
        this.things=mailTemplate.getThings();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Mail mail= (Mail) super.clone();
        return mail;
    }

    public MailTemplate getMailTemplate() {
        return mMailTemplate;
    }

    public void setMailTemplate(MailTemplate mailTemplate) {
        mMailTemplate = mailTemplate;
    }

    public String getTitle() {
        return mMailTemplate.getTitle();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThings() {
        return mMailTemplate.getThings();
    }

    public void setThings(String things) {
        this.things = things;
    }
}
