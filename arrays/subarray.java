import java.util.*;

class subarray {

    public static List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> sub = new ArrayList<>();

            for (int j = i; j < n; j++) {
                sub.add(arr[j]);
                result.add(new ArrayList<>(sub));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(getSubArrays(arr));
    }
}