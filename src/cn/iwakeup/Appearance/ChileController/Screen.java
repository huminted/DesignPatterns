package cn.iwakeup.Appearance.ChileController;

/**
 * @Author Humin
 * @Date 2018/10/07 19:13
 */
public class Screen extends AbsController {
    @Override
    public void On() {
        System.out.println("Screen On");
    }

    @Override
    public void Off() {
        System.out.println("Screen Off");
    }
}
