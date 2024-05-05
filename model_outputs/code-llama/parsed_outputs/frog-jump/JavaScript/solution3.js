function canCross(stones) {
   const dp = new Array(stones.length).fill(false);
   dp[0] = true;
   for (let i = 1; i < stones.length; i++) {
       for (let j = 0; j < i; j++) {
           if (stones[i] - stones[j] <= 1) {
               dp[i] = true;
               break;
           }
       }
   }
   return dp[stones.length - 1];
}
