   public int maxCoins(int[] nums) {
       int n = nums.length;
       int[] newNums = new int[n + 2];
       System.arraycopy(nums, 0, newNums, 1, n);
       newNums[0] = newNums[n + 1] = 1;

       int[][] memo = new int[n + 2][n + 2];
       return divideAndConquer(newNums, memo, 0, n + 1);
   }

   private int divideAndConquer(int[] nums, int[][] memo, int left, int right) {
       if (left + 1 >= right) return 0;
       if (memo[left][right] > 0) return memo[left][right];

       int maxCoins = 0;
       for (int i = left + 1; i < right; i++) {
           int coins = nums[left] * nums[i] * nums[right] 
                       + divideAndConquer(nums, memo, left, i) 
                       + divideAndConquer(nums, memo, i, right);
           maxCoins = Math.max(maxCoins, coins);
       }
       memo[left][right] = maxCoins;
       return maxCoins;
   }
   