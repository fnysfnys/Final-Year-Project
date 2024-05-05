class Solution {
    public int combinationSum4(int[] nums, int target) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        
        int combinations = 0;
        for (int num : nums) {
            combinations += combinationSum4(nums, target - num);
        }
        
        return combinations;
    }
}
