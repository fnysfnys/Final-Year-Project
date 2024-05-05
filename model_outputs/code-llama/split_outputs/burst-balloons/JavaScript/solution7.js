function maxCoins(nums) {
   return nums.sort((a, b) => b - a).reduce((a, b) => a * b, 1);
}
