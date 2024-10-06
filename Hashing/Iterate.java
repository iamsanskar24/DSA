import java.util.*;
public class Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",101);
        hm.put("Nepal",102);
        hm.put("Australia",100);
        hm.put("Indo",300);

        //Iterate
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key="+k+","+"value="+hm.get(k));
            
        }
    }
    
}
