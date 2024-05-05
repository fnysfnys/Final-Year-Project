class Solution {
    public boolean
    
    canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;
    
        return canWin(0, maxChoosableInteger, desiredTotal, new HashMap<>());
    }
    
    private boolean canWin(int state, int max, int total, Map<Integer, Boolean> memo) {
        if (total <= 0) return false;
        if (memo.containsKey(state)) return memo.get(state);
    
        for (int i = 0; i < max; i++) {
            if ((state & (1 << i)) == 0) {
                if (!canWin(state | (1 << i), max, total - (i + 1), memo)) {
                    memo.put(state, true);
                    return true;
                }
            }
        }
    
        memo.put(state, false);
        return false;
    }
}
