import java.util.*;
public class toggle{
    public static String toggleit(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch >= 'a'&& ch<='z'){
                char upper =(char)('A'+ ch -'a');
                sb.setCharAt(i,upper); 

            }else{
                char lower = (char)('a'+ch-'A');
                sb.setCharAt(i,lower);

            }
        }
        return sb.toString();

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleit(str));


        

    }
}