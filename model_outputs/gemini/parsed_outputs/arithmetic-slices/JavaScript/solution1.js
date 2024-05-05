var numberOfArithmeticSlices = function(nums) {
  if (nums.length < 3) return 0;

  const dp = new Array(nums.length).fill(0);
  let totalCount = 0;

  for (let i = 2; i < nums.length; i++) {
    if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
      dp[i] = dp[i - 1] + 1;
      totalCount += dp[i];
    }
  }

  return totalCount;
};
