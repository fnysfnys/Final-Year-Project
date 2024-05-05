class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int result = 10;
        for (int i = 2; i <= n && i <= 10; i++) {
            result += 9 * (int)Math.pow(9, i - 1);
        }
        return result;
    }
}
