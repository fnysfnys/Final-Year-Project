class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) {
            return true;
        }
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) {
            return false;
        }
        boolean[] dp = new boolean[1 << maxChoosableInteger];
        for (int state = 0; state < (1 << maxChoosableInteger); state++) {
            int total = 0;
            for (int j = 0; j < maxChoosableInteger; j++) {
                if ((state & (1 << j)) != 0) {
                    total += j + 1;
                }
            }
            if (total >= desiredTotal) {
                dp[state] = true;
                continue;
            }
            for (int j = 0; j < maxChoosableInteger; j++) {
                if ((state & (1 << j)) == 0 && !dp[state | (1 << j)]) {
                    dp[state] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
