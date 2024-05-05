class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int result = 10;
        int[] uniqueDigits = {9, 81, 648, 4536, 27216, 136080, 544320, 1632960, 3265920};
        for (int i = 2; i <= n && i <= 10; i++) {
            result += uniqueDigits[i - 2];
        }
        return result;
    }
}
