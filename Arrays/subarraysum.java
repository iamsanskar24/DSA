import java.util.*;
public class subarraysum{
    public static void subsum(int arr[]){
        int curSum ;
        for(int i=0;i<arr.length ;i++){
            for(int j=i;j<arr.length;j++){
                curSum=0;
                for(int k=i;k<=j;k++){
                    curSum+=arr[k];
                }
                System.out.println(curSum);
            }
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        subsum(arr);

    }
}

       