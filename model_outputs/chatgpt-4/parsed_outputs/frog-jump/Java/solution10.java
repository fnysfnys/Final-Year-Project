class Solution {
        public boolean canCross(int[] stones) {
            boolean[][] dp = new boolean[stones.length][stones.length + 1];
            dp[0][1] = true;
            for (int i = 1; i < stones.length; i++) {
                for (int j = 0; j < i; j++) {
                    int gap = stones[i] - stones[j];
                    if (gap < dp[j].length && dp[j][gap]) {
                        dp[i][gap] = true;
                        if (gap + 1 < dp[i].length) dp[i][gap + 1] = true;
                        if (gap - 1 > 0) dp[i][gap - 1] = true;
                    }
                }
            }
            for (int i = 0; i < dp[stones.length - 1].length; i++) {
                if (dp[stones.length - 1][i]) return true;
            }
            return false;
        }
    }