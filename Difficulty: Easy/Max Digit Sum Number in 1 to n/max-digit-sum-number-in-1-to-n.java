class Solution {
    public int findMax(int n) {
        int ans = n;
        int maxDigitsSum = getDigitSum(n);
        int current = n;
        int multiplier = 1;

        while (current > 0) {
            int lastDigit = current % 10;
            current /= 10;

            if (lastDigit > 0) {
                int candidate = (current * 10 + (lastDigit - 1)) * multiplier + (multiplier - 1);
                if (candidate >= 1) {
                    int candidateSum = getDigitSum(candidate);
                    if (candidateSum > maxDigitsSum) {
                        maxDigitsSum = candidateSum;
                        ans = candidate;
                    } else if (candidateSum == maxDigitsSum && candidate > ans) {
                        ans = candidate;
                    }
                }
            }
            multiplier *= 10;
        }

        return ans;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
