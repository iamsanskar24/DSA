import java.util.*;
public class diagonalsum {
    public static int ds(int matrix[][]){
        //o(n);
        int sum=0;
        for(int i=0;i<matrix.length-1;i++){
            //sd
            sum+=matrix[i][i];
            //pd
            int j=matrix.length-1-i;
            if(i!=j){
                sum+=matrix[i][j];
            }
        }
        return sum;
        //(o(n^2))
        //  int sum=0;
        //  for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum += matrix[i][j];

        //         }
        //     }
        //  }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int s=ds(arr);  
        System.out.println(s);              
    }
     
}
