import java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1[] = new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();

        }
        int m = sc.nextInt();
        int a2[] = new int[m];
        for(int i=0;i<m;i++){
            a2[i]=sc.nextInt();

        }
        
        int merge[] = new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=a1[i]; 

        }
        for(int i=0;i<m;i++){
            merge[i+n]=a2[i]; 

        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
    }
    
}
