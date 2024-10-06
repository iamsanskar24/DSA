import java.util.*;
public class Most {
    //bruteforce
    // public static void main(String[] args) {
        // ArrayList<Integer>ht=new ArrayList<>();
        // ht.add(1);
        // ht.add(8);
        // ht.add(6);
        // ht.add(2);
        // ht.add(5);
        // ht.add(4);
        // ht.add(8);
        // ht.add(3);
        // ht.add(7);
    //     int maxht = Integer.MIN_VALUE;
    //     for(int i=0;i<ht.size();i++){
    //         for(int j=i+1;j<ht.size();j++){
    //             int height = Math.min(ht.get(i),ht.get(j));
    //             int width = j-i;
    //             int water = height*width;
    //             maxht = Math.max(maxht,water);
    //         }
    //     }
    //     System.out.println(maxht);
    // }

    //2 pointer approach
    public static int StoreWater(ArrayList<Integer>ht){
        int maxwater = 0;
        int lp = 0;
        int rp = ht.size()-1;
        while(lp<rp){
            //calculate water area
            int height = Math.min(ht.get(lp),ht.get(rp));
            int width = rp-lp;
            int water = (height*width);
            maxwater = Math.max(maxwater,water);
            //update pointer
            if(ht.get(lp)<ht.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwater;



    }
    public static void main(String[] args) {
        ArrayList<Integer>ht=new ArrayList<>();
        ht.add(1);
        ht.add(8);
        ht.add(6);
        ht.add(2);
        ht.add(5);
        ht.add(4);
        ht.add(8);
        ht.add(3);
        ht.add(7);
        System.out.println(StoreWater(ht));
        
    }

    
}
