class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;
    
        return canWin(0, maxChoosableInteger, desiredTotal, new HashMap<>(), 0);
    }
    
    private boolean canWin(int used, int max, int total, Map<Integer, Boolean> memo, int currentSum) {
        if (currentSum >= total) return false;
        if (memo.containsKey(used)) return memo.get(used);
    
        for (int i = 1; i <= max; i++) {
            int mask = 1 << (i - 1);
            if ((used & mask) == 0 && !canWin(used | mask, max, total, memo, currentSum + i)) {
                memo.put(used, true);
                return true;
            }
        }
    
        memo.put(used, false);
        return false;
    }
}
