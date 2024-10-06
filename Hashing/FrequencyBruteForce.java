import java.util.*;
public class FrequencyBruteForce {
    public static void main(String[] args) {
        int arr[]={1,4,5,9,7,7,1,4,5}; //array input


        // Brute Force

        // int frequency[] = new int[arr.length]; //an array to store the frequency
        // int visited = -1; //for already visited items;

        // for(int i=0;i<arr.length;i++){
        //     int count =1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //             frequency[j]=visited;
        //         }
        //         if(frequency[i]!=visited){
        //             frequency[i]=count;
        //         }
        //     }
        // }
        // for(int i=0;i<frequency.length;i++){
        //     //print only for unique element
        //     if(frequency[i]!=visited){

        //         System.out.print(arr[i]+"-->"+" "+frequency[i]+" ");
        //     }
        // }

        //HashMap -> O(N)

        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        //print hashmap using entry set
        for(Map.Entry entry:hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }







    }
}
