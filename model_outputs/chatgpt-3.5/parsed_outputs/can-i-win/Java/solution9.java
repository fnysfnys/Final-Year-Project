class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        Integer[] memo = new Integer[1 << maxChoosableInteger];
        return canWin(maxChoosableInteger, desiredTotal, 0, memo);
    }

    private boolean canWin(int max, int total, int state, Integer[] memo) {
        if (total <= 0) return false;
        if (memo[state] != null) return memo[state] == 1;

        for (int i = 1; i <= max; i++) {
            int bit = 1 << (i - 1);
            if ((state & bit) == 0) {
                if (!canWin(max, total - i, state | bit, memo)) {
                    memo[state] = 1;
                    return true;
                }
            }
        }

        memo[state] = 0;
        return false;
    }
}