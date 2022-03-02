package com.company.patterns;

public class deep_recur {
    public static void main(String[] args) {
        //int arr[] ={1,2,3};
        //permu(arr);
        subsett("abc","");

    }
    public static void permu(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("["+arr[i]+"]");
            for (int j=i-1;j>=0;j--) {
                System.out.println("[" + arr[j] +","+ arr[i]+ "]");
            }
        }
    }
    static int fact(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;

        return fact(n-1) * n;
    }
    public static void subsett(String s,String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);

        subsett(s.substring(1),ans+ch);
        subsett(s.substring(1),ans);
    }
}