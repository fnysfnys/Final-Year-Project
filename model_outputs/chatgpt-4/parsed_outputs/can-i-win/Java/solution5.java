class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        int maxSum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
        if (maxSum < desiredTotal) return false;
    
        boolean[] dp = new boolean[1 << maxChoosableInteger];
        int total = 0;
        for (int i = maxChoosableInteger - 1; i >= 0; i--) {
            total += i + 1;
            for (int state = 0; state < (1 << maxChoosableInteger); state++) {
                if ((state & (1 << i)) == 0 && (total <= desiredTotal || !dp[state | (1 << i)])) {
                    dp[state] = true;
                }
            }
        }
        return dp[0];
    }
}
