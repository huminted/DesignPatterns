package cn.iwakeup.Bridge.OtherCompany;

/**
 * @Author Humin
 * @Date 2018/10/12 21:49
 */
public class SonyControl implements Control {
    @Override
    public void On() {
        System.out.println("---Sony On---");
    }

    @Override
    public void Off() {
        System.out.println("---Sony Off---");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("---Sony setChannel:---"+ch);
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("---Sony setVolume:---"+vol);
    }
}
