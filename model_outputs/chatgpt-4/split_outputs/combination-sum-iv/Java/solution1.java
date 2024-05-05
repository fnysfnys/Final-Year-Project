public int combinationSum4(int[] nums, int target) {
    if (target == 0) return 1;
    int count = 0;
    for (int num : nums) {
        if (target >= num) {
            count += combinationSum4(nums, target - num);
        }
    }
    return count;
}
