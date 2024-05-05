   public int maxCoins(int[] nums) {
       int n = nums.length;
       int[] newNums = new int[n + 2];
       System.arraycopy(nums, 0, newNums, 1, n);
       newNums[0] = newNums[n + 1] = 1;

       Integer[][] memo = new Integer[n + 2][n + 2];
       return recursiveBurst(memo, newNums, 0, n + 1);
   }

   private int recursiveBurst(Integer[][] memo, int[] nums, int left, int right) {
       if (left + 1 == right) return 0;
       if (memo[left][right] != null) return memo[left][right];
       int ans = 0;
       for (int i = left + 1; i < right; i++) {
           int coins = nums[left] * nums[i] * nums[right] 
                       + recursiveBurst(memo, nums, left, i) 
                       + recursiveBurst(memo, nums, i, right);
           ans = Math.max(ans, coins);
       }
       memo[left][right] = ans;
       return ans;
   }
   