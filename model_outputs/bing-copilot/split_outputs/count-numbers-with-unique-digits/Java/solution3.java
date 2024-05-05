public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return countNumbersWithUniqueDigits(n - 1) + (int) Math.pow(10, n) - countNumbersWithUniqueDigits(n - 1);
    }
}
