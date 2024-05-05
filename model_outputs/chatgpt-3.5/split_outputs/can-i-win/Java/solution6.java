class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        int[] used = new int[maxChoosableInteger + 1];
        Arrays.fill(used, -1);
        
        return canWin(maxChoosableInteger, desiredTotal, used, 0);
    }

    private boolean canWin(int max, int total, int[] used, int state) {
        if (total <= 0) return false;
        if (used[state] != -1) return used[state] == 1;

        for (int i = 1; i <= max; i++) {
            int bit = 1 << (i - 1);
            if ((state & bit) == 0) {
                if (!canWin(max, total - i, used, state | bit)) {
                    used[state] = 1;
                    return true;
                }
            }
        }

        used[state] = 0;
        return false;
    }
}
