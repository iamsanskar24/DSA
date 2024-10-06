import java.util.*;
public class wave{
    public static void traversal(int arr[][]){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        // int sr=0;
        // int sc=0;
        // int er=arr.length-1;
        // int ec=arr[0].length-1;
        // while(sr<er&&sc<ec){
        //     for(int i=sr;i<=er;i++){
        //         System.out.print(arr[i][sc]+" ");
                
        //     }
        //     sc++;
        //     for(int i=er;i>=sr;i--){
        //         System.out.print(arr[i][sc]+" ");
        //     }
        //     sc++;

            
        }
    
    public static void main(String args[]){
        int matrix[][]={{11,12,13,14},
                        {21,22,23,24},
                        {31,32,33,34}};
        traversal(matrix);                

    }
    

    
}
