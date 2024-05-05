class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        return helper(nums, target, memo);
    }
    
    private int helper(int[] nums, int target, int[] memo) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (memo[target] != -1) return memo[target];
        
        int combinations = 0;
        for (int num : nums) {
            combinations += helper(nums, target - num, memo);
        }
        
        memo[target] = combinations;
        return combinations;
    }
}
