package cn.iwakeup.Template.Things;

import cn.iwakeup.Template.Template.Template;

/**
 * @Author Humin
 * @Date 2018/10/07 22:26
 */
public class Coffee extends Template {

    public Coffee(String name) {
        super(name);
    }

    @Override
    public void brew() {
        System.out.println(super.mName+" brew Coffee ");
    }

    @Override
    public void addThings() {
        System.out.println(super.mName+" addThings Surge ");
    }
}
