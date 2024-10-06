import java.util.*;
public class permutation{
    public static void permute(String str){
        int n = str.length();
        int f = factorial(n);
        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i; //i ko bahar wala loop control karna hai isliye i ko pareshan nhi karenge hum temp ko pareshan karenge
            for(int div=n;div>=1;div--){
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;

            }
            System.out.println();

        }


    }
    public static int factorial(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val*=i;
        }
        return val;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permute(str);
    }
}