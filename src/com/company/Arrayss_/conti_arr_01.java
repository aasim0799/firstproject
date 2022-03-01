package com.company.Arrayss_;

import java.util.HashMap;
import java.util.Map;

public class conti_arr_01 {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,1,0};
        System.out.println(conti(arr));
    }
    public static int conti(int arr[]){
        int maxle=0;
        for (int i = 0; i < arr.length; i++) {
            int zero=0;
            int one=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    zero++;
                }
                else{
                    one++;
                }
            if(maxle < j-i+1 && one == zero){
                maxle=j-i+1;
            }
        }
        }
        return maxle;
    }
    public static int cont(int nums[]){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxle=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                sum+=-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
            maxle=Math.max(maxle,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxle;
    }
}
