class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        List<Integer> chosen = new ArrayList<>();
        return backtrack(maxChoosableInteger, desiredTotal, chosen);
    }
    
    private boolean backtrack(int maxChoosableInteger, int desiredTotal, List<Integer> chosen) {
        if (desiredTotal <= 0) {
            return false;
        }
        for (int i = 1; i <= maxChoosableInteger; i++) {
            if (!chosen.contains(i)) {
                chosen.add(i);
                if (!backtrack(maxChoosableInteger - 1, desiredTotal - i, chosen)) {
                    chosen.remove(chosen.size() - 1);
                    return true;
                }
                chosen.remove(chosen.size() - 1);
            }
        }
        return false;
    }
    
}
