import java.util.*;
public class aw {
    public static int buy(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(buyprice<arr[i]){
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
                return maxprofit;
            }
            else{
                buyprice=arr[i];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int max= buy(arr);
       System.out.println(max);
    }
}
