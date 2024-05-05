class Solution {
    public boolean canCross(int[] stones) {
      boolean[] dp = new boolean[stones.length];
      dp[0] = true;
      for (int i = 1; i < stones.length; i++) {
        for (int j = 0; j < i; j++) {
          int dist = stones[i] - stones[j];
          if (dist >= 1 && dist <= j + 1 && dp[j]) {
            dp[i] = true;
            break;
          }
        }
      }
      return dp[stones.length - 1];
    }
    
}
