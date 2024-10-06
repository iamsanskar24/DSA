 import java.util.*;
public class LinerSearch{
    public static int indexSearch(String arr[],String k){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(k)){
                return i;
               
            }
            
            
        }
        return -1;

    }
    public static void main(String args[]){
        //int marks[]={2,4,6,8,10,12,14,16};
        String menu[]={"Dosa","idli","Sambhar","Samosa","Maggie"};
        String key = "Sambhar";
        int index = indexSearch(menu,key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key found at index"+" " +index);
        }
        
          
    }
}
