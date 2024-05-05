class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 9, base = 9;
        for (int i = 2; i <= n; i++) {
            count *= base--;
        }
        return count;
    }
}
