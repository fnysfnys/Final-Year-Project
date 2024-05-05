class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        boolean[] used = new boolean[maxChoosableInteger + 1];
        return canWinRec(used, desiredTotal);
    }

    private boolean canWinRec(boolean[] used, int target) {
        for (int i = 1; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                if (target <= i || !canWinRec(used, target - i)) {
                    used[i] = false;
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}
