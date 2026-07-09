
 class Solution {

    static int minOps(int arr[], int k) {

        int max = arr[0];

        // Find maximum element
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        int rem = arr[0] % k;
        int ops = 0;

        for (int num : arr) {

            // Impossible if remainder differs
            if (num % k != rem)
                return -1;

            ops += (max - num) / k;
        }

        return ops;
    }
}