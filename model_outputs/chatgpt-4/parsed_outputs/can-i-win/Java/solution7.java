class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;
    
        return canWin(0, maxChoosableInteger, desiredTotal, new HashMap<>());
    }
    
    private boolean canWin(int usedNumbers, int max, int total, Map<Integer, Boolean> memo) {
        if (total <= 0) return false;
        if (memo.containsKey(usedNumbers)) return memo.get(usedNumbers);
    
        for (int i = 1; i <= max; i++) {
            int current = 1
    
     << (i - 1);
            if ((usedNumbers & current) == 0) {
                if (i >= total || !canWin(usedNumbers | current, max, total - i, memo)) {
                    memo.put(usedNumbers, true);
                    return true;
                }
            }
        }
        memo.put(usedNumbers, false);
        return false;
    }
}
