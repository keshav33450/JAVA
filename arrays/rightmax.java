import java.util.*;
public class rightmax{
    public static ArrayList<Integer> leader(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        int rightmax=arr[n-1];
        res.add(rightmax);
        for(int i=arr[n-2];i>=0;i++){
            if(arr[i]>rightmax){
                rightmax=arr[i];
                res.add(rightmax);
            }
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args){
        int [] arr={22,44,11,44,55};
        System.out.println(leader(arr));
    }
}