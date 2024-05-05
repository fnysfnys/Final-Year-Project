const memo = {};

var numberOfArithmeticSlices = function(nums, i = 0, diff = null) {
  if (i >= nums.length) return 0;

  const key = i + "_" + diff;
  if (memo[key] !== undefined) return memo[key];

  let res = 0;
  if (diff !== null) {
    res += numberOfArithmeticSlices(nums, i + 1, diff);
  }

  res += numberOfArithmeticSlices(nums, i + 1, nums[i + 1] - nums[i]);
  memo[key] = res;

  return res;
};
