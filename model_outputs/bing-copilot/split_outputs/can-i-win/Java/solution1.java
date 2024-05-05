import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        Map<Integer, Boolean> memo = new HashMap<>();
        return canWin(0, maxChoosableInteger, desiredTotal, memo);
    }

    private boolean canWin(int state, int max, int target, Map<Integer, Boolean> memo) {
        if (memo.containsKey(state)) return memo.get(state);
        for (int i = 1; i <= max; i++) {
            if ((state & (1 << i)) == 0) { // Number i not used yet
                if (target <= i || !canWin(state | (1 << i), max, target - i, memo)) {
                    memo.put(state, true);
                    return true;
                }
            }
        }
        memo.put(state, false);
        return false;
    }
}
