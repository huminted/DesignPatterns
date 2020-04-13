package cn.iwakeup.Command.Reciver;

/**
 * @Author Humin
 * @Date 2018 10 05 21:11
 */
public class Light  {

    private String mLightName;
    public Light(String LightName) {
        this.mLightName=LightName;
    }

    public void On(){
        System.out.println(mLightName+ " On ");
    }

    public void Off(){
        System.out.println(mLightName+ " Off ");
    }


}
