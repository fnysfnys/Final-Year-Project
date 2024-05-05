class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int result = 10;
        for (int i = 2; i <= n && i <= 10; i++) {
            result += 9 * permutation(9, i - 1);
        }
        return result;
    }
    
    private int permutation(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }
        return result;
    }
}
