import java.util.*;
public class Stocksrevision{
    public static int stocks(int arr[]){
        int Buyprice=Integer.MAX_VALUE;
        int Maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Buyprice<=arr[i]){
                int profit=arr[i]-Buyprice;
                Maxprofit=Math.max(profit,Maxprofit);

                
            }
            else{
                Buyprice=arr[i];
            }
        }
        
        return Maxprofit;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int Maxprofit=stocks(arr);
            System.out.println(Maxprofit);

    }

}