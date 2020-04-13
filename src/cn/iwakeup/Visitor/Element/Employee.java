package cn.iwakeup.Visitor.Element;

import cn.iwakeup.Visitor.Visitor.Visitor;

/**
 * @Author Humin
 * @Date 2018/10/18 20:38
 */
public class Employee extends Element {
    private int Id;
    private String name;
    private int degree;

    public Employee(int id, String name, int degree) {
        Id = id;
        this.name = name;
        this.degree = degree;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
