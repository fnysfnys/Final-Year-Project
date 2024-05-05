var numberOfArithmeticSlices = function(nums) {
  if (nums.length < 3) return 0;

  const set = new Set([nums[0]]);
  let count = 0, diff = null;

  for (let i = 1; i < nums.length; i++) {
    if (diff !== null && !set.has(nums[i] - diff)) {
      count += set.size - 1;
      set.clear();
    }
    set.add(nums[i]);
    diff = nums[i] - nums[i - 1];
  }

  count += set.size - 1;

  return count;
};
