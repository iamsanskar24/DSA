public class Sorted {
    public static boolean sort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr,i+1);

    }
    public static void main(String[] args) {
        int i=0;
        int arr[]={1,2,3,10,5,6};
        System.out.println(sort(arr,i));
        
    }
    
}
