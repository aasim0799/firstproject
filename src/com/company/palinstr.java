package com.company;

import java.util.*;

public class palinstr {
    public static void main(String args[]){
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum1(arr,8)));
    }
    public static int[] twoSum1(int[] nums, int target)
    {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<nums.length; i++)
            map.put(nums[i],i);


        for(int i=0; i<nums.length; i++)
        {
            int index = i;
            int anotherValue = target-nums[index];

            if(map.get(anotherValue)!=null && map.get(anotherValue)!=i)
            {
                result[0] = index;
                result[1] = map.get(target-nums[index]);

                return result;
            }
        }
        return result;
    }
}

