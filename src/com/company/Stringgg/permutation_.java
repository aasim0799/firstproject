package com.company.Stringgg;

import java.util.ArrayList;

public class permutation_ {
    public static void main(String[] args) {
        int  n=3;
        int k=3;
        System.out.println(getPermutation(n,k));
    }

    public static String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            fact *= i;
            numbers.add(i);
        }

        k--;
        fact /= n;
        String ans = "";

        while(true){
            int temp = k/fact;
            ans += numbers.get(temp);
            numbers.remove(temp);
            if(numbers.size() == 0)break;
            k %= fact;
            fact /= numbers.size();
        }

        return ans;
    }
}
