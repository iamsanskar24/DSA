import java.util.*;
public class LargestString{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]= str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String Largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if (Largest.compareTo(arr[i])<0){
                Largest = arr[i];
            }
        }
        System.out.println("your output is :-"+Largest);


    }
}
