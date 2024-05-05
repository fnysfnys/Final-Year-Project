var numberOfArithmeticSlices = function(nums) {
  const set = new Set();
  let res = 0;
  const diff = nums[1] - nums[0];

  for (const num of nums) {
    const prevNum = num - diff;
    if (set.has(prevNum)) {
      res += set.size;
    }
    set.add(num);
  }

  return res;
};
