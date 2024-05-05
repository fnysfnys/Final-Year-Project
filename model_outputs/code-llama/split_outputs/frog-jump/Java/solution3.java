public boolean canCross(int[] stones) {
   boolean[] dp = new boolean[stones.length];
   dp[0] = true;
   for (int i = 1; i < stones.length; i++) {
       for (int j = 0; j < i; j++) {
           if (stones[j] + 1 == stones[i]) {
               dp[i] = dp[j];
           }
       }
   }
   return dp[stones.length - 1];
}
