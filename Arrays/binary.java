import java.util.*;
public class binary{
    public static int BinarySearch(int arr[],int key){
       int i=0 , j=arr.length-1 ; 
       while(i<=j){
        int mid = i+(j-i)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            i=mid+1;
        }
        else{
            j=mid-1;
        }

       }
       return -1;


       
    }
     
    public static void main(String args[]){
        int arr[]={2,4,5,6,7,8};
        int key = 7;
        int search = BinarySearch(arr,key);
        System.out.println("The Index of key is:"+search);
        
       

    }

}