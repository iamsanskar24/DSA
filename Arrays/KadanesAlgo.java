import java.util.*;
public class KadanesAlgo{
    public static void kadane(int arr[]){
        int currsum=0;
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0 || arr[i]<=0){
                currsum+=arr[i];
                maxsum=Math.max(currsum,maxsum);
                if(currsum<0){
                    currsum=0;
                }
            }
            else if(arr[i]<0){
                maxsum=Math.max(arr[i],maxsum);
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        kadane(arr);
    }
    

}
                

            
                
            
    
            
            
            

            
            


