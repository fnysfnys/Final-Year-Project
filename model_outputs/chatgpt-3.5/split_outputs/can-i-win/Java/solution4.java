class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        boolean[] dp = new boolean[1 << maxChoosableInteger];
        
        for (int i = 1; i <= maxChoosableInteger; i++) {
            dp[(1 << i - 1)] = true;
        }
        
        for (int mask = 1; mask < (1 << maxChoosableInteger); mask++) {
            for (int i = 1; i <= maxChoosableInteger; i++) {
                int bit = 1 << (i - 1);
                if ((mask & bit) != 0) {
                    int nextState = mask ^ bit;
                    if (!dp[nextState]) {
                        dp[mask] = true;
                        break;
                    }
                }
            }
        }
        
        return dp[(1 << maxChoosableInteger) - 1];
    }
}
