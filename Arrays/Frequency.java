
import java.util.Scanner;


public class Frequency{
   
    public static void frequency(int n,int p,int arr[]){
        int i,j;
        for(i=0;i<n;){
            if(arr[i]>0 && arr[i]<=n){
                j=arr[i]-1;//index for storing frequency
                //pehle aya ya nhi aya
                if(arr[j]<=0){
                    arr[i]=0;
                    arr[j]-=1;
                    i++;
                }
                //swap
                else{
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    
                    arr[j]= -1;
                }
            }else if(arr[i]>n){
                arr[i]=0;
                i++;
            }else{
                i++;
            }

        }
        for(i=0;i<n;i++){
            arr[i]=-arr[i];//for making positive
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        frequency(n,p,arr);
      
    }

}
