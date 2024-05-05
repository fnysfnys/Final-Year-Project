var lengthOfLIS = function(nums) {
  const dp = Array(nums.length).fill(0);

  function lis(i) {
    if (i === nums.length) return 0;
    if (dp[i] > 0) return dp[i];

    let maxLength = 1;
    for (let j = 0; j < i; j++) {
      if (nums[j] < nums[i]) {
        maxLength = Math.max(maxLength, 1 + lis(j));
      }
    }
    dp[i] = maxLength;
    return maxLength;
  }

  return lis(0);
};
