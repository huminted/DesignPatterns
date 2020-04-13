package cn.iwakeup.Template.Things;

import cn.iwakeup.Template.Template.Template;

/**
 * @Author Humin
 * @Date 2018/10/07 22:17
 */
public class Tea extends Template {

    public Tea(String name) {
        super(name);
    }

    @Override
    public void brew() {
        System.out.println(super.mName+" brew Tea ");
    }

    @Override
    public void addThings() {
        System.out.println(super.mName+" addThings Lemon ");
    }

    @Override
    public boolean addThingsHook() {
        return false;
    }
}
