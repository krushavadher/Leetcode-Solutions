class Solution {
    public int maxProduct(int n) {
        int[] arr = new int[String.valueOf(n).length()];
        int idx = 0;
        while (n > 0) {
            arr[idx++] = n % 10;
            n /= 10;
        }
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                max = Math.max(arr[i] * arr[j], max);

            }
        }
        return max;
    }
}