import java.util.*;
public class Anagram{
    public static Boolean isAnagram(String str1 , String str2){
        //First Convert string to lower case. Why? so that we dont have 
        //to check separately for lower and uppercase.
        String s = str1.toLowerCase() ;
        String t = str2.toLowerCase() ;
        //check if lengths are same or not.
        // if(str1.length()==str2.length()){
        //     //convert string to char arrays;
        //     char str1chararray[]=s.toCharArray();
        //     char str2chararray[]=t.toCharArray();
        //     //sort the char arrays
        //     Arrays.sort(str1chararray);
        //     Arrays.sort(str2chararray);
        //     //now check for anagram
        //     boolean result = Arrays.equals(str1chararray,str2chararray);
        //     if(result){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }

        // }
        // return false;
        for(int i=0 ; i<str1.length(); i++){
            CharSequence ch = s.charAt(i);
            if(str1.length()== str2.length()){
                if(t.contains(ch)){
                    return true;
                }

            }
        }
        return false ;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(isAnagram(str1,str2));

    }
}