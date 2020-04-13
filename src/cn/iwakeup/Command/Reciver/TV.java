package cn.iwakeup.Command.Reciver;

/**
 * @Author Humin
 * @Date 2018 10 05 21:16
 */
public class TV  {

    private String mTVName;
    private int vol;
    public TV(String TVName) {
        this.mTVName=TVName;
    }

    public void On(){
        System.out.println(mTVName+ " On ");
    }

    public void Off(){
        System.out.println(mTVName+ " Off ");
    }

    public void VolAdd(){
        if (vol<10){
         this.vol= ++vol;
        }else {
            System.out.println("已经静最大音量😭");
        }
        System.out.println(mTVName+" Vol "+vol);
    }

    public void VolLess(){
        if (vol>0){
            this.vol=  --vol;
        }else {
            System.out.println("已经静音🔕");
        }
        System.out.println(mTVName+" Vol "+vol);
    }


}
