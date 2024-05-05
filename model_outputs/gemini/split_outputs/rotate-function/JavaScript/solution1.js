var maxRotateFunction = function(nums) {
  let n = nums.length;
  let sum = 0;
  let maxF = 0;
  
  for (let i = 0; i < n; i++) {
    sum += nums[i];
    maxF = Math.max(maxF, F(i, nums, sum));
  }
  
  return maxF;
};

function F(k, nums, sum) {
  let f = 0;
  for (let i = 0; i < nums.length; i++) {
    f += (i * nums[i]) - ((n - k - 1) * nums[(i + k) % n]);
  }
  return f + (k * sum);
}
