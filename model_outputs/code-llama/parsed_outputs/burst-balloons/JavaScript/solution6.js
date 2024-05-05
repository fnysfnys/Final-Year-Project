function maxCoins(nums) {
   return nums.find(num => num > 0).reduce((a, b) => a * b, 1);
}
