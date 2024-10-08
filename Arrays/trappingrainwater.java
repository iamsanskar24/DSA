import java.util.*;
public class trappingrainwater{
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //calculate left max boundary in array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){

            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        
        //calculate right max boundaries in array
       int rightMax[]= new int[n];
       rightMax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){

        rightMax[i]=Math.max(height[i],rightMax[i+1]);

       }

        
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel = min(leftmax.rightmax)
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water = waterlevel-height[i]
            trappedwater+=waterlevel-height[i];

        }
        return trappedwater;

        
            
              

        
        


        
    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int height[]= new int[n];
    for(int i=0;i<height.length;i++){
        height[i]=sc.nextInt();
    }
    int tw=trappedRainWater(height);
    System.out.println(tw);

    
    


   } 
}