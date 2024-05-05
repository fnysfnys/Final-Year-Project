public int combinationSum4(int[] nums, int target) {
  if (target == 0) {
    return 1;
  }
  int count = 0;
  for (int num : nums) {
    if (target - num >= 0) {
      count += combinationSum4(nums, target - num);
      // Prune if count overflows
      if (count < 0) {
        return 0;
      }
    }
  }
  return count;
}
