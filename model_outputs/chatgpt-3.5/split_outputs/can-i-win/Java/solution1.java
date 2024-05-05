import java.util.*;

class Solution {
    private Map<Integer, Boolean> memo;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        memo = new HashMap<>();
        return canWin(0, maxChoosableInteger, desiredTotal);
    }

    private boolean canWin(int state, int max, int total) {
        if (total <= 0) return false;
        if (memo.containsKey(state)) return memo.get(state);

        for (int i = 1; i <= max; i++) {
            int mask = 1 << (i - 1);
            if ((state & mask) == 0) {  // If the number is not used yet
                if (!canWin(state | mask, max, total - i)) {
                    memo.put(state, true);
                    return true;
                }
            }
        }

        memo.put(state, false);
        return false;
    }
}
