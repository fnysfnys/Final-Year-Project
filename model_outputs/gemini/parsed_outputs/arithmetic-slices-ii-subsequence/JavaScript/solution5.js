var numberOfArithmeticSlices = function(nums) {
  const map = new Map();
  let res = 0;

  for (const num of nums) {
    if (map.has(num - nums[0])) {
      res += map.get(num - nums[0]);
    }
    map.set(num, (map.get(num) || 0) + 1);
  }

  return res;
};
