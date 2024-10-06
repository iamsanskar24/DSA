import java.util.*;
public class Monotonic {
    public static boolean IsMonotonic(ArrayList<Integer>list){
        for(int i=0;i<list.size();i++){
            
            if(list.get(i)<=list.get(i+1)){
                return true;

                
            }else if(list.get(i)>=list.get(i+1)){
                return true;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list= new ArrayList<>();
        
        System.out.println(IsMonotonic(list));

        
    }
}
