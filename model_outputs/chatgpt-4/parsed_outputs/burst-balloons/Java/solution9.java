class Solution {
    public int maxCoins(int[] nums) {
           int n = nums.length;
           int[] newNums = new int[n + 2];
           for (int i = 0; i < n; i++) {
               newNums[i + 1] = nums[i];
           }
           newNums[0] = newNums[n + 1] = 1;
    
           return recursiveMaxCoins(newNums, 0, n + 1, new Integer[n + 2][n + 2]);
       }
    
       private int recursiveMaxCoins(int[] nums, int left, int right, Integer[][] memo) {
           if (left + 1 >= right) return 0;
           if (memo[left][right] != null) return memo[left][right];
           int max = 0;
           for (int i = left + 1; i < right; i++) {
               int coins = nums[left] * nums[i] * nums[right] 
                           + recursiveMaxCoins(nums, left, i, memo) 
                           + recursiveMaxCoins(nums, i, right, memo);
               max = Math.max(max, coins);
           }
           memo[left][right] = max;
           return max;
       }
}
