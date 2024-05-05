class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        boolean[] used = new boolean[maxChoosableInteger + 1];
        Boolean[][] memo = new Boolean[1 << maxChoosableInteger][desiredTotal + 1];
        
        return canWin(desiredTotal, used, memo, maxChoosableInteger, 0);
    }

    private boolean canWin(int total, boolean[] used, Boolean[][] memo, int max, int state) {
        if (total <= 0) return false;
        if (memo[state][total] != null) return memo[state][total];

        for (int i = 1; i <= max; i++) {
            if (!used[i]) {
                used[i] = true;
                if (!canWin(total - i, used, memo, max, state | (1 << (i - 1)))) {
                    used[i] = false;
                    memo[state][total] = true;
                    return true;
                }
                used[i] = false;
            }
        }

        memo[state][total] = false;
        return false;
    }
}