import java.util.*;

public class pushzeroatend {

    public static int[] pushZeroAtEnd(int[] arr) {
        int j = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0};

        pushZeroAtEnd(arr);

        System.out.println(Arrays.toString(arr));
    }
}