var maxRotateFunction = function(nums) {
  let n = nums.length;
  let maxCurrent = 0, maxSoFar = 0;
  let sum = 0;
  
  for (let i = 0; i < n; i++) {
    maxCurrent = Math.max(0, maxCurrent + nums[i] - (n - 1 - i) * nums[i]);
    maxSoFar = Math.max(maxSoFar, maxCurrent);
    sum += nums[i];
  }
  
  return sum - maxSoFar;
};
