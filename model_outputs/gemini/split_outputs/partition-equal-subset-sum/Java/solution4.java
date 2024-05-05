public boolean canPartition(int[] nums) {
  int sum1 = 0, sum2 = 0;
  Arrays.sort(nums);
  for (int i = nums.length - 1; i >= 0; i--) {
    if (sum1 <= sum2) {
      sum1 += nums[i];
    } else {
      sum2 += nums[i];
    }
  }
  return Math.abs(sum1 - sum2) <= 1;
}
