import java.util.*;

public class duplicate {

    public static ArrayList<Integer> duplicate(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        if (arr.length == 0)
            return res;

        res.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                res.add(arr[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 11, 32, 32, 44};
        System.out.println(duplicate(arr));
    }
}