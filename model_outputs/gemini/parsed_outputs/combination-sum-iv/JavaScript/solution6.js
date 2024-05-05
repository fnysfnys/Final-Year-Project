function combinationSum4(nums, target) {
  const n = nums.length;
  const ways = Array(target + 1).fill(0);
  ways[0] = 1;
  for (let i = 1; i <= target; i++) {
    for (let j = 0; j < n; j++) {
      if (i >= nums[j]) {
        ways[i] = (ways[i] + ways[i - nums[j]]) % Math.pow(10, 9);
      }
    }
  }
  return ways[target];
}
