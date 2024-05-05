class Solution {
    public int nthUglyNumber(int n) {
        long left = 1, right = Integer.MAX_VALUE, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (countUglyNumbers(mid) < n) left = mid + 1;
            else right = mid;
        }
        return (int) left;
    }
    
    private long countUglyNumbers(long num) {
        long count = 0;
        for (long i = 1; i <= num; i++) {
            if (isUgly(i)) count++;
        }
        return count;
    }
    
    private boolean isUgly(long num) {
        for (int i : new int[]{2, 3, 5}) {
            while (num % i == 0) num /= i;
        }
        return num == 1;
    }
}
