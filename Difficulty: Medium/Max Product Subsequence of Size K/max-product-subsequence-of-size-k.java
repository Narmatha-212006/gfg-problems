import java.util.Arrays;

class Solution {
    public int maxProduct(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);

        if (arr[n - 1] < 0 && k % 2 != 0) {
            long prod = 1;
            for (int i = n - k; i < n; i++) {
                prod *= arr[i];
            }
            return (int) prod;
        }

        int left = 0;
        int right = n - 1;
        long maxProduct = 1;

        if (k % 2 != 0) {
            maxProduct *= arr[right];
            right--;
            k--;
        }

        while (k > 0) {
            long leftPairProduct = (long) arr[left] * arr[left + 1];
            long rightPairProduct = (long) arr[right] * arr[right - 1];

            if (leftPairProduct > rightPairProduct) {
                maxProduct *= leftPairProduct;
                left += 2;
            } else {
                maxProduct *= rightPairProduct;
                right -= 2;
            }
            k -= 2;
        }

        return (int) maxProduct;
    }
}
