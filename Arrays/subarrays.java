import java.util.*;
public class subarrays{
    public static void subs(int arr[]){
        int tsa=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                tsa++;
                System.out.println();
             }
             System.out.println();
            
        }
        System.out.println("Total n0. of sub arrays="+ tsa);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        subs(arr);
    }
}

