function twoSum(nums, target) {
  const seen = new Set();
  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    if (seen.has(complement)) {
      return [i, seen.get(complement)];
    }
    seen.add(nums[i]);
  }
  throw new Error('No two sum solution found');
}
