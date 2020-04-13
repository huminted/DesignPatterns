package cn.iwakeup.FlyWeight;

import cn.iwakeup.FlyWeight.Weight.Grass;
import cn.iwakeup.FlyWeight.Weight.Plants;
import cn.iwakeup.FlyWeight.Weight.Tree;

import java.util.HashMap;

/**
 * @Author Humin
 * @Date 2018/10/16 18:03
 */
public class FlyWeightFactory {

    HashMap<Integer, Plants> mMap;
    public FlyWeightFactory() {
        mMap=new HashMap<>();
    }


    public Plants getPlant(int type){
        if (!mMap.containsKey(type)){
            switch (type){
                case 0:
                    mMap.put(type,new Grass());
                    break;
                case 1:
                    mMap.put(type,new Tree());
                    break;
            }
        }


        return mMap.get(type);
    }
}
