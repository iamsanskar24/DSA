 import java.util.*;
public class Largest{
    public static int getLargest(int arr[]){
        int Largest = Integer.MIN_VALUE;   // -infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
      
        return Largest;
    }
    public static int getSmallest(int arr[]){
        int Smallest = Integer.MAX_VALUE;   // +infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Smallest){
                Smallest=arr[i];
            }
        }
        return Smallest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int Largest = getLargest(arr);
        int Smallest = getSmallest(arr);
        System.out.println(Largest);
        System.out.println(Smallest);


    }
}