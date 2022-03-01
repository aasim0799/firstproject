package com.company.recuersive;

public class mincoins {
    public static void main(String[] args) {
        int n=17;
        int [] a={7,5};

        System.out.println(mincoin(n,a));

    }
    public static int mincoin(int n,int a[]) {
        if (n == 0) return 0;
         int ans=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
              if (n-a[i] >= 0) {
                  int subAns = mincoin(n-a[i],a);
                  if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                      ans = subAns + 1;
                  }
              }
        }
        return ans;
    }
}
