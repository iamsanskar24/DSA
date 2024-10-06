import java.util.*;
public class create{
    //search in matrix
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static int min(int matrix[][]){
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                minval=Math.min(minval,matrix[i][j]);
            }
        }
        return minval;
    }
    public static int max(int matrix[][]){
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               maxval=Math.max(maxval,matrix[i][j]) ;
            }
        }
        return maxval;
    }
    public static void main(String args[]){

        //input
        int matrix[][]=new int[3][3];
        int key=4;
        Scanner sc =new Scanner(System.in);
        int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,key);
        int min=min(matrix);
        int max=max(matrix);
        System.out.println(min);
        System.out.println(max);

    }
}