class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        boolean[] used = new boolean[maxChoosableInteger + 1];
        return canWin(maxChoosableInteger, desiredTotal, used);
    }

    private boolean canWin(int max, int total, boolean[] used) {
        if (total <= 0) return false;

        for (int i = 1; i <= max; i++) {
            if (!used[i]) {
                used[i] = true;
                if (!canWin(max, total - i, used)) {
                    used[i] = false;
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }
}
