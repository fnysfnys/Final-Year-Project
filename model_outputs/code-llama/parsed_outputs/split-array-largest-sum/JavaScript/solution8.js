function splitArray(nums, k) {
   let memo = new Array(nums.length + 1).fill(0);
   for (let i = 1; i <= nums.length; i++) {
       memo[i] = Math.max(memo[i - 1], nums[i - 1] + memo[i - 2]);
   }
   return memo[nums.length];
}
