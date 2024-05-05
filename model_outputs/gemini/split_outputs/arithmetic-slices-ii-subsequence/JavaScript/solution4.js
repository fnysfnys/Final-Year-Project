var numberOfArithmeticSlices = function(nums) {
  let res = 0;
  let left = 0, right = 2;

  while (right < nums.length) {
    const prevDiff = nums[right - 1] - nums[right - 2];
    const curDiff = nums[right] - nums[right - 1];

    if (prevDiff !== curDiff) {
      const len = right - left;
      res += len * (len - 1) / 2;
      left = right - 1;
    }

    right++;
  }

  const len = right - left;
  res += len * (len - 1) / 2;

  return res;
};
