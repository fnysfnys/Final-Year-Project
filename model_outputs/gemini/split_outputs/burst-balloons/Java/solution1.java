public int maxCoins(int[] nums) {
  int n = nums.length;
  // Handle edge cases with 0 or 1 balloons
  if (n == 0) return 0;
  if (n == 1) return nums[0];

  int max = 0;
  for (int i = 1; i < n - 1; i++) {
    int left = burst(nums, 0, i - 1);
    int right = burst(nums, i + 1, n - 1);
    int current = nums[i - 1] * nums[i] * nums[i + 1];
    max = Math.max(max, left + current + right);
  }
  return max;
}

private int burst(int[] nums, int start, int end) {
  if (start > end) return 0;
  int max = 0;
  for (int i = start; i <= end; i++) {
    int left = burst(nums, start, i - 1);
    int right = burst(nums, i + 1, end);
    int current = (start == 0 ? 1 : nums[start - 1]) * nums[i] * (end == n - 1 ? 1 : nums[end + 1]);
    max = Math.max(max, left + current + right);
  }
  return max;
}
