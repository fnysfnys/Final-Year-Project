class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int result = 10;
        int uniqueDigits = 9;
        int availableDigits = 9;
        while (n-- > 1 && availableDigits > 0) {
            uniqueDigits *= availableDigits;
            result += uniqueDigits;
            availableDigits--;
        }
        return result;
    }
}
