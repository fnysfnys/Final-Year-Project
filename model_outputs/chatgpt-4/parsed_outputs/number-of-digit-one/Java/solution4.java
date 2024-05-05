class Solution {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;
        if (n < 10) return 1;
        int lastDigit = n % 10;
        int rest = n / 10;
        return countDigitOne(rest) + countDigitOne(n - lastDigit) + (lastDigit == 1 ? n % 10 + 1 : 0);
    }
}
