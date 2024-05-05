var numberOfArithmeticSlices = function(nums) {
  let res = 0;

  for (let i = 0; i < nums.length - 2; i++) {
    const diff = nums[i + 1] - nums[i];
    for (let j = i + 2; j < nums.length; j++) {
      if (nums[j] - nums[j - 1] !== diff) break;
      res++;
    }
  }

  return res;
};
