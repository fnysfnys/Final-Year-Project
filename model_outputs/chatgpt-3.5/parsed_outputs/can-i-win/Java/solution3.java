class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        boolean[] used = new boolean[maxChoosableInteger + 1];
        return canWin(desiredTotal, used);
    }

    private boolean canWin(int total, boolean[] used) {
        if (total <= 0) return false;

        for (int i = 1; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                if (!canWin(total - i, used)) {
                    used[i] = false;
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }
}