var numberOfArithmeticSlices = function(nums) {
  if (nums.length < 3) return 0;

  let dp = 0, totalCount = 0;

  for (let i = 2; i < nums.length; i++) {
    if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
      dp++;
      totalCount += dp;
    } else {
      dp = 0;
    }
  }

  return totalCount;
};
