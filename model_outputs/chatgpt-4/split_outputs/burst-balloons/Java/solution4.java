   public int max

Coins(int[] nums) {
       int n = nums.length;
       int[] extendedNums = new int[n + 2];
       System.arraycopy(nums, 0, extendedNums, 1, n);
       extendedNums[0] = extendedNums[n + 1] = 1;

       int[][] dp = new int[n + 2][n + 2];
       for (int len = 2; len < n + 2; len++) {
           for (int left = 0; left < n + 2 - len; left++) {
               int right = left + len;
               for (int i = left + 1; i < right; i++) {
                   dp[left][right] = Math.max(dp[left][right],
                                              extendedNums[left] * extendedNums[i] * extendedNums[right] 
                                              + dp[left][i] + dp[i][right]);
               }
           }
       }
       return dp[0][n + 1];
   }
   