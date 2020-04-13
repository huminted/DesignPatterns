package cn.iwakeup.Template.Template;

/**
 * @Author Humin
 * @Date 2018/10/07 22:12
 */
public abstract class Template {

    public String mName;
    public Template(String name) {
        this.mName=name;
    }

    public final void prePare(){

        boilWater();
        brew();
        inToCup();
        if (addThingsHook()){
            addThings();
        }else {
            System.out.println(mName+" Nothing Add To Drink");
        }




    }


    public final void boilWater(){
        System.out.println(mName+" boilWater💧 ");
    }

    public abstract void brew();

    public final void inToCup(){
        System.out.println(mName+" inToCup ☕");
    }

    public abstract void addThings();

    public boolean addThingsHook(){

        return true;
    }
}
