package cn.iwakeup.Template;


import cn.iwakeup.Template.Things.Coffee;
import cn.iwakeup.Template.Things.Tea;

/**
 * @Author Humin
 * @Date 2018/10/07 22:11
 */
public class TemplateMain {

    public static void main(String a[]){
        Tea tea=new Tea("Tea");
        tea.prePare();
        System.out.println();

        Coffee coffee=new Coffee("Coffee");
        coffee.prePare();
    }
}
