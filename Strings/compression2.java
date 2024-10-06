import java.util.*;
public class compression2{
    public static String comp(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>0){
                    sb.append(count);
                    count=1;
                }
                sb.append(curr);
            }

        }
        if(count>0){
            sb.append(count);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(comp(str));
    }
}