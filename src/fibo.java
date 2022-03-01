public class fibo {
    public static void main(String[] args) {
        //System.out.println(fibo(6));
        System.out.println(factorial(4));
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
     public static int factorial(int n) {
        if (n == 1) return 1;
        int remaining = factorial(n - 1);
        return remaining * n;
    }
}
