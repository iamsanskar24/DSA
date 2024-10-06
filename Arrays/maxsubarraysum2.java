import java.util.*;
public class maxsubarraysum2 {
    public static void prefixsum(int arr[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            currsum=0;
            for(int j=i;j<arr.length;j++){
                currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];

            }
            if(currsum>maxSum){
                maxSum=currsum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        prefixsum(arr);

    }
}