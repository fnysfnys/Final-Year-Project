class Solution {
        public boolean canCross(int[] stones) {
            boolean[][] dp = new boolean[stones.length][stones.length];
            dp[0][0] = true;
            for (int i = 1; i < stones.length; i++) {
                for (int j = 0; j < i; j++) {
                    int gap = stones[i] - stones[j];
                    if (gap < stones.length && dp[j][gap]) {
                        dp[i][gap] = true;
                        if (gap - 1 >= 0) dp[i][gap - 1] = true;
                        if (gap + 1 < stones.length) dp[i][gap + 1] = true;
                    }
                }
            }
            for (boolean canReach : dp[stones.length - 1]) {
                if (canReach) return true;
            }
            return false;
        }
    }