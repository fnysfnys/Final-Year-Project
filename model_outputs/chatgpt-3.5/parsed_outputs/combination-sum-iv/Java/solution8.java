class Solution {
    public int combinationSum4(int[] nums, int target) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        
        return Arrays.stream(nums)
                .mapToLong(num -> combinationSum4(nums, target - num))
                .sum();
    }
}
