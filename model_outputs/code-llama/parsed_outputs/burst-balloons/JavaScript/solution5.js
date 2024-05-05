function maxCoins(nums) {
   return nums.filter(num => num > 0).reduce((a, b) => a * b, 1);
}
