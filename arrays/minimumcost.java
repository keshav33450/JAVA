
 class Solution{
    public int cost(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min * (n - 1);
    }
}