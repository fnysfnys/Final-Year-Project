function maxCoins(nums) {
   return nums.slice(0, nums.length - 1).reduce((a, b) => a * b, 1);
}
