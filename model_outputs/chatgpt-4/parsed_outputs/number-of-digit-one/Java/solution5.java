class Solution {
    private int[] memo;
    
    public int countDigitOne(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countDigitOneHelper(n);
    }
    
    private int countDigitOneHelper(int n) {
        if (n <= 0) return 0;
        if (n < 10) return 1;
        if (memo[n] != -1) return memo[n];
    
        int lastDigit = n % 10;
        int rest = n / 10;
        memo[n] = countDigitOneHelper(rest) + countDigitOneHelper(n - lastDigit) + (lastDigit == 1 ? n % 10 + 1 : 0);
        return memo[n];
    }
}
