package cn.iwakeup.Prototype.Prototype;

/**
 * @Author Humin
 * @Date 2018/10/17 19:12
 */
public class MailTemplate {

    private String title;
    private String things;


    public MailTemplate(String title, String things) {
        this.title = title;
        this.things = things;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }
}
