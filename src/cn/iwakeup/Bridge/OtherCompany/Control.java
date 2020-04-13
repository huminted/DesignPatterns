package cn.iwakeup.Bridge.OtherCompany;

/**
 * @Author Humin
 * @Date 2018/10/12 21:47
 */
public interface Control {
    void On();
    void Off();
    void setChannel(int ch);
    void setVolume(int vol);
}
