import java.util.*;
public class BuySellStocks{
    public static int profit(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);

            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[]= new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int Maxprofit = profit(prices);
        System.out.println(Maxprofit);
    }

}
    