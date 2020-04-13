package cn.iwakeup.Bridge.OtherCompany;

/**
 * @Author Humin
 * @Date 2018/10/12 21:51
 */
public class LGControl implements Control {
    @Override
    public void On() {
        System.out.println("---LG On---");
    }

    @Override
    public void Off() {
        System.out.println("---LG Off---");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("---LG setChannel:---"+ch);
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("---LG setVolume:---"+vol);
    }
}
