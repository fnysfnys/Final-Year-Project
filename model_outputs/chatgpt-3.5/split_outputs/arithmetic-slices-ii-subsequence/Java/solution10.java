public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            count += countSubsequences(nums, j, nums[j] -

 nums[i], 2);
        }
    }
    
    return count;
}

private int countSubsequences(int[] nums, int index, int diff, int length) {
    if (index == nums.length) {
        return length >= 3 ? 1 : 0;
    }
    
    int count = 0;
    if (nums[index] - nums[index - 1] == diff) {
        count += countSubsequences(nums, index + 1, diff, length + 1);
    }
    count += countSubsequences(nums, index + 1, diff, length);
    
    return count;
}
