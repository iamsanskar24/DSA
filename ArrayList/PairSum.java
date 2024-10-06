import java.util.*;
public class PairSum {
    public static boolean target(ArrayList<Integer>ht,int tar){
        //brute force

        // for(int i=0;i<ht.size();i++){
        //     for(int j=i+1;j<ht.size();j++){
        //         if(ht.get(i)+ht.get(j)==tar){
        //             return true;
        //         }
        //     }
        // }
        // return false;
         
        //2-pointer approach
        int lp =0,rp=ht.size()-1;
        while(lp<rp){
            if(ht.get(lp)+ht.get(rp)==tar){
                return true;
            }
            else if(ht.get(lp)+ht.get(rp)<tar){
                lp++;
            }
            if(ht.get(lp)+ht.get(rp)>tar){
                rp--;
            }
        }
        return false;

         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>ht=new ArrayList<>();
        ht.add(1);
        ht.add(2);
        ht.add(3);
        ht.add(4);
        ht.add(5);
        ht.add(6);
        int tar = sc.nextInt();
        System.out.println(target(ht,tar));
        
        
    }
    
}
