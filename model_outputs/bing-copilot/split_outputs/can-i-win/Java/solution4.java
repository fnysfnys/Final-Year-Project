class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        Boolean[] memo = new Boolean[1 << maxChoosableInteger];
        return canWinBacktrack(0, maxChoosableInteger, desiredTotal, memo);
    }

    private boolean canWinBacktrack(int state, int max, int target, Boolean[] memo) {
        if (memo[state] != null) return memo[state];
        for (int i = 1; i <= max; i++) {
            if ((state & (1 << i)) == 0) { // Number i not used yet
                if (target <= i || !canWinBacktrack(state | (1 << i), max, target - i, memo)) {
                    memo[state] = true;
                    return true;
                }
            }
        }
        memo[state] = false;
        return false;
    }
}
