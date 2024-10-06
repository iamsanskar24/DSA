import java.util.*;
public class Operations {
    public static void main(String[] args) {
        //vreate
        HashMap<String,Integer>hm=new HashMap<>();

        //Insert
        hm.put("India", 91);
        hm.put("Pak", 92);
        hm.put("China", 93);
        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        //ContainsKey - 0(1)
        System.out.println(hm.containsKey("India"));

        //Remove - O(1)
       System.out.println(hm.remove("China"));
       System.out.println(hm);

       //Size 
       System.out.println(hm.size());

       //isEmpty()
       hm.clear();
       System.out.println(hm.isEmpty());







    }
    
}
