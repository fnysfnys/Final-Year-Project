var maxRotateFunction = function(nums) {
  let n = nums.length;
  let sum = nums.reduce((acc, num) => acc + num, 0);
  let fPrev = 0;
  let maxF = 0;
  
  for (let i = 1; i < n; i++) {
    fPrev = fPrev + sum - n * nums[i - 1] + i * nums[i];
    maxF = Math.max(maxF, fPrev);
  }
  
  return maxF;
};
