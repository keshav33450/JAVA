import java.util.*;
public class getalternate{
    public static ArrayList<Integer> getalternate(int[] arr){
        ArrayList<Integer> res =new ArrayList<>();
        int n= arr.length;
        for(int i=0;i<n;i+=2){
            res.add(arr[i]);

        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(getalternate(arr));
    }
}