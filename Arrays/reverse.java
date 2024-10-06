import java.util.*;
public class reverse{
    public static void rev(int arr[]){
        int i=0 , j=arr.length-1;
        while(i<=j){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}