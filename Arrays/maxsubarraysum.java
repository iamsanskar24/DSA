import java.util.*;
public class maxsubarraysum{
    public static void maxsum(int arr[]){
        int curSum;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curSum=0;
                for(int k=i;k<=j;k++){
                    curSum+=arr[k];
                }
                System.out.println(curSum);
                if(curSum>maxSum){
                    maxSum=curSum;
                }
                
            }
            System.out.println();
        }
        System.out.println("maximum sum is="+maxSum);
    }
    public static void minsum(int arr[]){
        int currsum=0;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                if(currsum<minSum){
                    minSum=currsum;
                }
            }
            System.out.println();
        }
        System.out.println("minimum sum is="+minSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        maxsum(arr);
        minsum(arr);

    }
}