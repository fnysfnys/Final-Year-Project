class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;
    
        return canWin(0, desiredTotal, new HashMap<>(), maxChoosableInteger);
    }
    
    private boolean canWin(int usedNumbers, int remaining, Map<Integer, Boolean> memo, int max) {
        if (remaining <= 0) return false;
        if (memo.containsKey(usedNumbers)) return memo.get(usedNumbers);
    
        for (int i = 1; i <= max; i++) {
            int current = 1 << (i - 1);
            if ((usedNumbers & current) == 0) {
                if (remaining <= i || !canWin(usedNumbers | current, remaining - i, memo, max)) {
                    memo.put(usedNumbers, true);
                    return true;
                }
            }
        }
    
        memo.put(usedNumbers, false);
        return false;
    }
}
