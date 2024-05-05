const memo = {};

var numberOfArithmeticSlices = function(nums, i = 0, diff = null) {
  if (i >= nums.length) return 0;

  const key = `${i}-${diff}`;

  if (memo[key]) return memo[key];

  let count = 0;

  if (diff !== null && nums[i] - nums[i - 1] === diff) {
    count += 1 + numberOfArithmeticSlices(nums, i + 1, diff);
  } else {
    count += numberOfArithmeticSlices(nums, i + 1, nums[i] - nums[i - 1]);
  }

  memo[key] = count;

  return count;
};
