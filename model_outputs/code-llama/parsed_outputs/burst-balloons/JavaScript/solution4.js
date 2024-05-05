function maxCoins(nums) {
   return nums.reduce((a, b) => a * b, 1);
}
