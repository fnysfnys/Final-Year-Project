function maxCoins(nums) {
   return nums.map((num, i) => num * nums[i - 1] * nums[i + 1]).reduce((a, b) => a + b);
}
