class Solution {
    public int maxCoins(int[] nums) {
           int n = nums.length;
           int[] newNums = new int[n + 2];
           for (int i = 0; i < n; i++) {
               newNums[i + 1] = nums[i];
           }
           newNums[0] = newNums[n + 1] = 1;
    
           int[][] memo = new int[n + 2][n + 2];
           return burst(memo, newNums, 0, n + 1);
       }
    
       private int burst(int[][] memo, int[] nums, int left, int right) {
           if (left + 1 == right) return 0;
           if (memo[left][right] > 0) return memo[left][right];
           int ans = 0;
           for (int i = left + 1; i < right; i++) {
               ans = Math.max(ans, nums[left] * nums[i] * nums[right] 
                                 + burst(memo, nums, left, i) + burst(memo, nums, i, right));
           }
           memo[left][right] = ans;
           return ans;
       }
}
