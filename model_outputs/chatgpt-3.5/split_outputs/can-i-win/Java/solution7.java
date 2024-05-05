import java.util.*;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        Map<String, Boolean> memo = new HashMap<>();
        return canWin(maxChoosableInteger, desiredTotal, 0, memo);
    }

    private boolean canWin(int max, int total, int state, Map<String, Boolean> memo) {
        if (total <= 0) return false;
        String key = state + "-" + total;
        if (memo.containsKey(key)) return memo.get(key);

        for (int i = 1; i <= max; i++) {
            int bit = 1 << (i - 1);
            if ((state & bit) == 0) {
                if (!canWin(max, total - i, state | bit, memo)) {
                    memo.put(key, true);
                    return true;
                }
            }
        }

        memo.put(key, false);
        return false;
    }
}
