class Solution {
    public int integerBreak(int n) {
        if (n < 2) return 0;
        double threshold = 2.0;
        int left = 1, right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid * (n - mid) > threshold * integerBreak(n - mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return Math.max(left * (n - left), integerBreak(n - left));
    }
}
