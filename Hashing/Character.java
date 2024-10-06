import java.util.*;
public class Character {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String str = "Sanskar";

        char[]ch = str.toCharArray();

        //precompute
        int hash[] = new int[256];
        for(int i=0;i<str.length();i++){
            hash[ch[i]]+=1;

        }
        char ch1 = sc.next().charAt(0);
        
        System.out.println(hash[ch1]);
        

        
        
    }
    
}
