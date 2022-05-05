package com.company;
import java.util.*;

public class sorting0 {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,0,1};
        System.out.println(Arrays.toString(segregate0and1(arr)));
        //[0, 0, 0, 1, 1, 1, 1, 1]
    }

       static int [] segregate0and1(int arr[])
        {
            int left = 0, right = arr.length - 1;

            while (left < right)
            {
                if (arr[left] == 0 ){
                    left++;
                }

                if (arr[right] == 1 ) {
                    right--;
                }
                if (left < right)
                {
                    arr[left] = 0;
                    arr[right] = 1;
                    left++;
                    right--;
                }
            }
            return arr;
        }
}
