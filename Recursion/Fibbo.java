import java.util.*;
public class Fibbo {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(20));
        System.out.println(fib(21));
        System.out.println(fib(22));
        System.out.println(fib(23));
        System.out.println(fib(24));
        System.out.println(fib(25));
        
    }
    
}
