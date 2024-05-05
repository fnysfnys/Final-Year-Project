import java.util.*;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        
        Set<Integer> used = new HashSet<>();
        return canWin(maxChoosableInteger, desiredTotal, used);
    }

    private boolean canWin(int max, int total, Set<Integer> used) {
        if (total <= 0) return false;
        int key = getKey(used);
        if (used.contains(key)) return false;

        for (int i = 1; i <= max; i++) {
            if (!used.contains(i)) {
                used.add(i);
                if (!canWin(max, total - i, used)) {
                    used.remove(i);
                    return true;
                }
                used.remove(i);
            }
        }

        used.add(key);
        return false;
    }

    private int getKey(Set<Integer> used) {
        int key = 0;
        for (int num : used) {
            key |= 1 << (num - 1);
        }
        return key;
    }
}
