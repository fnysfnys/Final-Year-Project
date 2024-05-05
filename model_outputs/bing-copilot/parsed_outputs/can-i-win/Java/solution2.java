class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        boolean[] dp = new boolean[1 << maxChoosableInteger];
        return canWinDP(0, maxChoosableInteger, desiredTotal, dp);
    }

    private boolean canWinDP(int state, int max, int target, boolean[] dp) {
        if (dp[state]) return true;
        for (int i = 1; i <= max; i++) {
            if ((state & (1 << i)) == 0) { // Number i not used yet
                if (target <= i || !canWinDP(state | (1 << i), max, target - i, dp)) {
                    dp[state] = true;
                    return true;
                }
            }
        }
        dp[state] = false;
        return false;
    }
}
