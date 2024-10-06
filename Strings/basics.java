import java.util.*;
public class basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //  String s1 = "hello";
        String str ="abc def ghi jkl mno";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     System.out.println(ch);
        // }
        String arr[]=str.split(" ");
        for(int i=0;i<  arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}