import java.util.*;
public class hw {
    public static void trap(int arr[]){
        int n=arr.length;
        int lm[]=new int[n];
        lm[0]=arr[0];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(arr[i],lm[i-1]);
        }
        int rm[]=new int[n];
        rm[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(arr[i],rm[i+1]);
        }
        int tw =0;
        for(int i=0;i<n;i++){
            int wl = Math.min(lm[i],rm[i]);
            tw+=(wl - arr[i]);
        }
        System.out.println(tw);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        trap(arr);

    }
}
