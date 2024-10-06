import java.util.*;
public class basics2{
    public static void main(String args[]){
        // StringBuilder sb = new StringBuilder("hello");
        //EXCEPTION 
        int n = 1000000;
        long start = System.currentTimeMillis();
        // StringBuilder sb = new StringBuilder();
        String str = " ";
        for(int i=0;i<n;i++){
            // sb.append(i);
            str+=i;
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);

    }
}