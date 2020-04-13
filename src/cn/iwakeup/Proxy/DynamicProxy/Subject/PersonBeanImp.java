package cn.iwakeup.Proxy.DynamicProxy.Subject;

/**
 * @Author Humin
 * @Date 2018/10/11 18:53
 */
public class PersonBeanImp implements Bean {

    private String name,sex;
    private int count;

    public PersonBeanImp(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getStar() {
        return count;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setSex(String sex) {
        this.sex=sex;
    }

    @Override
    public void setStar(int count) {
        this.count=count;
    }
}
