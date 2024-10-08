import java.util.*;
public class compression{
    public static String compression1(String str){
        // String s = str.charAt(0)+"";
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr!=prev){
                sb.append(curr);
            }
             
            
        }
        return sb.toString();
    }
    public static String compression2(String str) {
        // String s = str.charAt(0)+"";
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                if(count>1){
                    sb.append(count);
                    count = 1;
                }
                sb.append(curr);

            }
             
            
        }
        if(count>1){
            sb.append(count);
        }

        return sb.toString();
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}