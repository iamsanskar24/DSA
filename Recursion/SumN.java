public class SumN {
    public static int SumofN(int n){
        if(n==1){
            return 1;


        }
        int sm1=SumofN(n-1);
        int sum=n+sm1;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumofN(n));

    }
}
