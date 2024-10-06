import java.util.*;
public class PairSum2 {
    public static boolean target(ArrayList<Integer>ht,int tar){
        int bp = -1;
        for(int i=0;i<ht.size();i++){
            if(ht.get(i)>= ht.get(i+1)){
                bp=i;
                break;
            }
        }
        int n = ht.size();
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            //case1
            if(ht.get(lp)+ht.get(rp)==tar){
                return true;
            }else if(ht.get(lp)+ht.get(rp)<tar){
                lp=(lp+1)%n;

            }else{
                rp=(n+rp-1)%n;
            }

        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>ht=new ArrayList<>();
        ht.add(11);
        ht.add(15);
        ht.add(6);
        ht.add(8);
        ht.add(9);
        ht.add(10);
        int tar = sc.nextInt();
        System.out.println(target(ht,tar));
    }
    
}
