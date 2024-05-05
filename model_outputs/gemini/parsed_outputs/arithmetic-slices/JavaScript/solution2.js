var numberOfArithmeticSlices = function(nums) {
  if (nums.length < 3) return 0;

  let count = 0, diff = nums[1] - nums[0], curr = 2;

  while (curr < nums.length) {
    if (nums[curr] - nums[curr - 1] !== diff) {
      count += Math.floor((curr - 2) * (curr - 1) / 2);
      diff = nums[curr] - nums[curr - 1];
      curr = 2;
    } else {
      curr++;
    }
  }

  count += Math.floor((curr - 2) * (curr - 1) / 2);

  return count;
};
