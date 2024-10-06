public class split {
    public static void main(String args[]){
        String s = "ab,cd,ef,gh,ij kl";
        String arr[]=s.split(",");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
