class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        Boolean[] memo = new Boolean[1 << maxChoosableInteger];
        return canWin(maxChoosableInteger, desiredTotal, 0, memo);
    }

    private boolean canWin(int max, int total, int state, Boolean[] memo) {
        if (total <= 0) return false;
        if (memo[state] != null) return memo[state];

        for (int i = 1; i <= max; i++) {
            int bit = 1 << (i - 1);
            if ((state & bit) == 0) {
                if (!canWin(max, total - i, state | bit, memo)) {
                    memo[state] = true;
                    return true;
                }
            }
        }

        memo[state] = false;
        return false;
    }
}
