class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        Integer[][] memo = new Integer[n][n];
        return dfs(nums, 0, -1, memo);
    }
    
    private int dfs(int[] nums, int idx, int prevIdx, Integer[][] memo) {
        if (idx >= n) return 0;
        if (memo[idx][prevIdx + 1] != null) return memo[idx][prevIdx + 1];
        int count = 0;
        if (prevIdx == -1 || nums[idx] - nums[prevIdx] == nums[prevIdx] - nums[prevIdx - 1]) {
            count = 1 + dfs(nums, idx + 1, idx, memo);
        }
        count += dfs(nums, idx + 1, prevIdx, memo);
        memo[idx][prevIdx + 1] = count;
        return count;
    }
    
}
