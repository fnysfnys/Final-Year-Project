public int lengthOfLIS(int[] nums) {
  return helper(nums, -1, 0);
}

private int helper(int[] nums, int prev, int cur) {
  if (cur >= nums.length) return 0;

  int include = 0;
  if (prev == -1 || nums[cur] > nums[prev]) {
    include = helper(nums, cur, cur + 1) + 1;
  }

  int exclude = helper(nums, prev, cur + 1);

  return Math.max(include, exclude);
}
