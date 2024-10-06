import java.util.*;
public class trappingrevision{
    public static int trapped(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        int RightMax[]=new int[n];
        RightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(arr[i],RightMax[i+1]);
        }
        int tw=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],RightMax[i]);
            tw+=(waterlevel-arr[i]);
        }
        return tw;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int trapped = trapped(arr);
            System.out.println(trapped);
    }
}