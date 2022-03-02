package com.company.Stringgg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class permutation_ {
    public static void main(String[] args) throws IOException {
        BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n = Integer.parseInt(scan.readLine());
        System.out.println("enter k");
        int k=Integer.parseInt(scan.readLine());
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
        StringBuilder ans = new StringBuilder();

        while(true){
            int temp = k/fact;
            ans.append(numbers.get(temp));
            numbers.remove(temp);
            if(numbers.size() == 0)break;
            k %= fact;
            fact /= numbers.size();
        }

        return ans.toString();
    }
}
