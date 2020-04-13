package cn.iwakeup.Visitor.Element;

import cn.iwakeup.Visitor.Visitor.Visitor;

/**
 * @Author Humin
 * @Date 2018/10/18 20:36
 */
public abstract class Element {
    public abstract void Accept(Visitor visitor);


}
