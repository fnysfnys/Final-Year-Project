class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;
    
        return canIWin(0, desiredTotal, new int[1 << maxChoosableInteger], maxChoosableInteger);
    }
    
    private boolean canIWin(int state, int total, int[] memo, int max) {
        if (total <= 0) return false;
        if (memo[state] != 0) return memo[state] == 1;
    
        for (int i = 1; i <= max; i++) {
            if ((state & (1 << (i - 1))) == 0) {
                if (!canIWin(state | (1 << (i - 1)), total - i, memo, max)) {
                    memo[state] = 1;
                    return true;
                }
            }
        }
    
        memo[state] = -1;
        return false;
    }
}
