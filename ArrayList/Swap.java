import java.util.*;
public class Swap {
    public static void swapidx(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx2);
        list.set(idx2,list.get(idx1));
        list.set(idx1,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        Scanner sc = new Scanner(System.in);
        int idx1=sc.nextInt();
        int idx2=sc.nextInt();
        swapidx(list,idx1,idx2);
        System.out.println(list);

        

    
    }
    
}
