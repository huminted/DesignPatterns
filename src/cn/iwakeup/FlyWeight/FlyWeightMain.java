package cn.iwakeup.FlyWeight;

import cn.iwakeup.FlyWeight.Weight.Plants;

import java.util.Random;

/**
 * @Author Humin
 * @Date 2018/10/16 17:58
 */
public class FlyWeightMain {
    public static void main(String a[]){

        int length=10000000;
        int [] xArray=new int[length];
        int [] yArray=new int[length];
        int [] typeArray=new int[length];

        FlyWeightFactory flyWeightFactory=new FlyWeightFactory();
        Plants plants;

        showMemory();
        for (int i = 0; i <length ; i++) {

            xArray[i]= new Random().nextInt()*10;
            yArray[i]= new Random().nextInt()*100;
            typeArray[i]=new Random().nextInt(10)%2;

        }
        showMemory();

        for (int i = 0; i <length ; i++) {

            plants=flyWeightFactory.getPlant(typeArray[i]);
            plants.display(xArray[i], yArray[i], typeArray[i]);
        }


    }

    private static void showMemory(){

        long free =Runtime.getRuntime().freeMemory();
        long total=Runtime.getRuntime().totalMemory();
        long used=total-free;

        long time=System.currentTimeMillis();

        System.out.println("使用内存"+used);
        System.out.println("时间"+time);




    }


}
