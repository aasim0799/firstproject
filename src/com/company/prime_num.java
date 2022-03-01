package com.company;

public class prime_num {
    public static void main(String[] args) {
        int n=5;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {
        boolean[] notprime = new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(notprime[i])
                continue;
            count++;
            for(int j=i;j<n;j=j+i){
                notprime[j]=true;
            }
        }
        return count;
    }
}
