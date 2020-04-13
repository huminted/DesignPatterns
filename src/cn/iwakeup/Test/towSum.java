package cn.iwakeup.Test;

import java.util.*;

public class towSum {


    public static void main(String[] args) {


        System.out.println(  twoSum(new int[]{2,7,10,1,3}, 8));

    }


    public static int[] twoSum(int[] nums, int target) {

        Map map = new HashMap();
        HashSet myset=new HashSet();



         for (int i = 0; i < nums.length; i++) {
             map.put((nums[i]),i);
             myset.add(nums[i]);
         }

         Iterator iterable=myset.iterator();

        while (iterable.hasNext()){
            int x= (int) iterable.next();
            int y=target-x;
            if (myset.contains(y)){
                return new int[]{(int) map.get(y), (int) map.get(x)};

            }
        }


        return new int[]{};

    }


}




   
