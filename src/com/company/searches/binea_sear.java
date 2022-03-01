package com.company.searches;

public class binea_sear {
    public static void main(String[] args) {
        int [] arr ={5,6,7,8,9,1,2,3};
        int [] a={5,6,1,2,3,4};
        int [] b={4,5,6,7,0,1,2};
        System.out.println(rotate(b,0,arr.length-1,0));
    }
    public static int  binar(int [] arr,int start,int end,int target) {
        if(start >= end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]  ==  target) {
            return mid;
        }
        if(arr[mid] < target) {
            return  binar(arr,mid+1,end,target);
        }
        return  binar(arr,start,mid-1,target);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
    public static int rotate(int [] arr,int start,int end,int target) {
        if(start > end) return -1;
        int mid=start+(end-start)/2;
        if (target == arr[mid]) {
            return mid;
        }
        if(arr[mid] >= arr[start]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return  rotate(arr,start,mid-1,target);
            }
            else{
                return   rotate(arr,mid+1,end,target);
            }
        }
        else {
             if(target >= arr[mid] && target <= arr[end]) {
                 return rotate(arr,mid+1,end,target);
             }
             else {
                 return rotate(arr,start,mid-1,target);
             }
        }
    }
}
